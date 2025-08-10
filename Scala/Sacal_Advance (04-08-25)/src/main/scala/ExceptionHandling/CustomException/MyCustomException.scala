package ExceptionHandling.CustomException

class MyCustomException(message: String) extends Exception{
  def validate(age: Int): Unit = {
    if(age <= 18){
      throw new MyCustomException("Age Must be Greater than 18")
    }else{
      println("Valid Age")
    }
  }
}
