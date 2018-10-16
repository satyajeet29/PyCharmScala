package dataGenerator
import scala.util.Random

class generator (var dataType: String,var dataSize: Int,var dataVolume: Int,var dataMultiplierSwitch: Boolean,var dataSorted: Int) {
                  // declaration of a function
     def test(): Unit = {
                        //dataSize      = dSize + dataSize
                        //dataVolume    = dVolume + dataVolume
                        println("Data Size: "+dataSize)
                        println("Data Volume: "+dataVolume)
                }
    
     //generate a random string
    def stringGenerator(textLength: Int): String = {
                                                      dataSize = dataSize + textLength
                                                      var stringRandom: String = Random.alphanumeric.take(dataSize).mkString("")
                                                      return stringRandom      
    }
    
    //generate a random integer
    def intGenerator(intSize: Int): Int = {
                                            dataSize = dataSize + intSize
                                            var intRandom: Int = Random.nextInt
                                            //ensure to return positive integers only
                                            if (intRandom > 0) 
                                            {
                                              return intRandom
                                            } 
                                            else 
                                            {
                                              return intRandom * (-1)
                                            }
                                            
    }
    
    //generate a random float
    def floatGenerator(floatSize: Int): Float = {
                                                   dataSize = dataSize + floatSize
                                                   var floatRandom: Float = Random.nextFloat
                                                   return floatRandom
    }
    
    //generate a random double
    def doubleGenerator(doubleSize: Int): Double = {
                                                   dataSize = dataSize + doubleSize
                                                   var doubleRandom: Double = Random.nextDouble
                                                   return doubleRandom
    }
    //generate a random Long
    def longGenerator(floatSize: Int): Long = {
                                                   dataSize = dataSize + floatSize
                                                   var longRandom: Long = Random.nextLong
                                                  //ensure to return positive integers only
                                                    if (longRandom > 0) 
                                                      {
                                                        return longRandom
                                                      } 
                                                      else 
                                                      {
                                                         return longRandom * (-1)
                                                      }
    }
    
}
