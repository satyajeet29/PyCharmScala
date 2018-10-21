package dataGenerator

import java.io.{BufferedWriter, FileWriter}

import scala.collection.JavaConversions._
import scala.collection.mutable.ListBuffer
import scala.util.Random
import java.util.Calendar 
import java.io.File 

import au.com.bytecode.opencsv.CSVWriter

object testInternal {
  def main(args: Array[String]) {
    println(Calendar.getInstance().getTime()+":-->>			 Writing file started")
    
    //println("Hello World Test!")
    var testValue = new generator("Int", 16, 500, true, 2)
    //testValue.test()
    //Defining path for writing file
      //Declaring the file path and name with variable fw
      var fw = new FileWriter("test.csv");
      var filePath = new File("test.csv");
      
      // writing it down as a buffered output
      val outputFile = new BufferedWriter(fw) //replace the path with the desired path and filename with the desired filename
      val csvWriter = new CSVWriter(outputFile)
      var arraySchema = Array("index","string","int","float","double","long")
      var mainArray   = Array(arraySchema)
      var records = new ListBuffer[Array[String]]()
      var storeTime: Long = 0 //initializing the beginning of a record
      var count :Int  = 0
      var rowCounter: Int = 0
      
      records += arraySchema
      csvWriter.writeAll(records.toList)
      storeTime = Calendar.getInstance().getTimeInMillis()
   for (i <- 1 to 400)
   {
    var records = new ListBuffer[Array[String]]()
       
        for (x <- 1 to 50)
          {
            rowCounter+=1
            var index  = rowCounter.toString()
            var string = testValue.stringGenerator(12).toString()
            var int    = testValue.intGenerator(120).toString()
            var float  = testValue.floatGenerator(120).toString()
            var double = testValue.doubleGenerator(120).toString()
            var long   = testValue.longGenerator(120).toString()
            var smallList = Array(index, string, int, float, double, long)
            records  += smallList
            smallList = Array()
        }
    
      csvWriter.writeAll(records.toList)    
      println(Calendar.getInstance().getTime()+":-->> 			 "+(Calendar.getInstance().getTimeInMillis() - storeTime)
          +" milliseconds			"+rowCounter+" 			records written" + "		File size in MB:"+ filePath.length()/1000000 )
      storeTime = Calendar.getInstance().getTimeInMillis()
    
   }    
      outputFile.close()
      println(Calendar.getInstance().getTime()+":-->>			 Writing file completed")
      
  }
} 