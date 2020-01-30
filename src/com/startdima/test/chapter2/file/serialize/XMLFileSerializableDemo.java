/**   
 * @Title XMLFileSerializableDemo.java 
 * @Package com.startdima.test.chapter2.file 
 * @Description XML文件序列化和反序列化 
 * @author dengjiajun deng-jiajun@outlook.com 
 * @date 2019年7月23日 下午5:00:18 
 * @version V1.0   
 */ 

package com.startdima.test.chapter2.file.serialize;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/** 
 * @ClassName XMLFileSerializableDemo 
 * @Description XML文件序列化和反序列化
 * @author dengjiajun deng-jiajun@outlook.com
 * @date 2019年7月23日 下午5:00:18 
 *  
 */
public class XMLFileSerializableDemo {
    
    static String xmlFilePath = System.getProperty("user.dir") + "\\xml"; // xml文件夹路径
    static String[] destXMLFileName = {"1.xml", "2.xml", "3.xml", "4.xml", "5.xml", "6.xml"};
    /** 
     * @Title main 
     * @Description XML文件序列化和反序列化
     * @param args
     * @return void
     * @throws 
     */
    public static void main(String[] args) {
//        readTextFileTest();
//        xstreamTest();
//        
//        // object to xml arraylist
        ArrayList<String> xmlArrayList=object2XMLStringArrayList();
//        
//        // write in file : destXMLFileName
        writeXML2File(xmlArrayList,destXMLFileName);
//        
        // read all xml file in path, get obejct
        ArrayList<Person> persons=readXmlFile2Object(xmlFilePath);
        System.out.println("all object read form xml file:");
        persons.forEach(System.out::println);
        
    }
    
    

    /**
     * 
     * @Title readTextFileTest 
     * @Description 测试读取文本文件内容
     * @return void
     * @throws
     */
    private static void readTextFileTest() {
        
        File file = new File(xmlFilePath);
        File[] files = file.listFiles();
        for (File f : files) {
            if (!f.isDirectory() && f.getName().endsWith(".txt")) {
                System.out.println("file name: " + f.getName());
                System.out.print("file data: ");
                BufferedReader bufferedReader = null;
                try {
                    FileReader fileReader=new FileReader(f);
                    bufferedReader = new BufferedReader(fileReader);
                    String tempString = null;
                    int line = 1;
                    while ((tempString = bufferedReader.readLine()) != null) {
                        System.out.println(line + ": " + tempString);
                        line++;
                    }
                    bufferedReader.close();
                    fileReader.close();
                } catch (FileNotFoundException e) {      
                    e.printStackTrace();
                } catch (IOException e) {      
                    e.printStackTrace();
                }
            }
        }
    }
    
    /**
     * 
     * @Title xstreamTest 
     * @Description 使用XStream序列化对象至xml,将xml反序列化为对象
     * @return void
     * @throws
     */
    private static void xstreamTest()
    {
        Person person = new Person();
        person.setName("姓名");
        person.setAge(26);
        person.setSex("男");
        // 先创建一下XStream对象
        // 创建方式1
        XStream xstream = new XStream(new DomDriver());
        //创建方式2
//        XStream xstream = new XStream(new StaxDriver());


        // 将Java对象序列化成XML
        System.out.println("序列化");
        String personXML = xstream.toXML(person);
        // 输出XML
        System.out.println(personXML);

        // 写入.xml文件
        try {
            FileWriter fileWriter = new FileWriter("output.xml");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(personXML);
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // 读取.xml文件
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader("output.xml");
            bufferedReader = new BufferedReader(fileReader);
            String tempString = null;
            String fullString = new String();
            int line = 1;
            while ((tempString = bufferedReader.readLine()) != null) {
                System.out.println(line + ": " + tempString);
                fullString+=tempString;
                if(line%5==0) {
                    System.out.println("-----------------");
                    System.out.println(fullString);
                    
                 // 反序列化
                    Person parsePerson = (Person)xstream.fromXML(fullString);
                    System.out.println(parsePerson);
                    
                    System.out.println("-----------------");
                    line=0;
                    fullString="";
                }
                    line++;
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 反序列化
//        Person parsePerson = (Person)xstream.fromXML(personXML);
//        System.out.println(parsePerson);
    
    }

    /**
     * 
     * @Title object2XMLStringArrayList 
     * @Description 将对象转化为XML格式的字符串并写入ArrayList
     * @return
     * @return ArrayList<String>
     * @throws
     */
    private static ArrayList<String> object2XMLStringArrayList() {
        
        // create data and put arraylist 
        ArrayList<Person> personArray=new ArrayList<>();
        Person person =null;
        for(int i=0;i!=10;++i)
        {
            person=new Person(i,"姓名"+i,"性别"+i);
            personArray.add(person);
        }
//        personArray.forEach(System.out::println);
        
        // serialize object to xml string 
        ArrayList<String> xmlArrayList=new ArrayList<>();
        XStream xstream = new XStream(new DomDriver());
        for (Person p : personArray) {
        String personXML = xstream.toXML(p);
        xmlArrayList.add(personXML);
        }
        
//        xmlArrayList.forEach(System.out::println);
        return xmlArrayList;
    }
    
    
    
    /**
     * 
     * @Title writeXML2File 
     * @Description 将XML格式的字符串写入几个文件
     * @param xmlArrayList
     * @param destXMLFileName
     * @return void
     * @throws
     */
    private static void writeXML2File(ArrayList<String> xmlArrayList, String[] destXMLFileName) {
        int xmlArrSize = xmlArrayList.size();
        int fileNum = destXMLFileName.length;
        for (int i = 0; i != xmlArrSize; ++i) {
            FileWriter fileWriter = null;
            BufferedWriter bufferedWriter = null;
            String filename = new String();
            try {
                filename = xmlFilePath + "\\" + destXMLFileName[i % fileNum];
                System.out.println("Write file "+filename+" …");
                fileWriter = new FileWriter(filename, true);
                bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(xmlArrayList.get(i) + "\n");
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Fill all data sucessful. ");

    }

    
    /**
     * 
     * @Title readXmlFile2Object 
     * @Description 读取对应路径下所有XML格式字符串，并转换为对象写入ArrayList
     * @param xmlFilePath
     * @return
     * @return ArrayList<Person>
     * @throws
     */
    private static ArrayList<Person> readXmlFile2Object(String xmlFilePath) {
        ArrayList<Person> persons=new ArrayList<>();
        XStream xstream = new XStream(new DomDriver());
        File file = new File(xmlFilePath);
        File[] files = file.listFiles();
        for (File f : files) {
            if (!f.isDirectory() && f.getName().endsWith(".xml")) {
                BufferedReader bufferedReader = null;
                try {
                    FileReader fileReader=new FileReader(f);
                    bufferedReader = new BufferedReader(fileReader);
                    String tempString = null;
                    String fullString = new String();
                    int line = 1;
                    while ((tempString = bufferedReader.readLine()) != null) {
                        
                        fullString+=tempString;
                        if(line%5==0) {// 一个数据块五行
                            
                         // 反序列化
                            Person parsePerson = (Person)xstream.fromXML(fullString);
                            persons.add(parsePerson);

                            line=0;
                            fullString="";
                        }
                        line++;
                    }
                    bufferedReader.close();
                    fileReader.close();
                } catch (FileNotFoundException e) {      
                    e.printStackTrace();
                } catch (IOException e) {      
                    e.printStackTrace();
                }
            }
        }
        return persons;
        
    }
}

