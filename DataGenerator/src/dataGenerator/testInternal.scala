package dataGenerator

import java.io.{BufferedWriter, FileWriter}

import scala.collection.JavaConversions._
import scala.collection.mutable.ListBuffer
import scala.util.Random

import au.com.bytecode.opencsv.CSVWriter

object testInternal {
  def main(args: Array[String]) {
    println("Hello World Test!")
    var testValue = new generator("Int", 128, 500, true, 2)
    testValue.test()
    //Defining path for writing file
      //Declaring the file path and name with variable fw
      var fw = new FileWriter("test.csv");
      // writing it down as a buffered output
      val outputFile = new BufferedWriter(fw) //replace the path with the desired path and filename with the desired filename
      val csvWriter = new CSVWriter(outputFile)
      var schemaTuple = ("index","string","int","float","double","long")
      var Array = new Array[Any]r
    for (x <- 1 to 10)
    {
      var string = testValue.stringGenerator(13)
      var int    = testValue.intGenerator(120)
      var float  = testValue.floatGenerator(120)
      var double = testValue.doubleGenerator(120)
      var long   = testValue.longGenerator(120)
      var tupleList = (x, string, int, float, double, long)
      mainList = any2String(mainList) + any2stringadd(tupleList)
      println( x +':')
      println(string)
      println(int)
      println(float)
      println(double)
      println(long)
      println()
      
      
    }
  }
}