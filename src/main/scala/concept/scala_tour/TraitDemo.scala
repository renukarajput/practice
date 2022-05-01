package concept.scala_tour


trait Pet {
    def getVoice() : String
}

trait Dog extends Pet {
  override def getVoice(): String = "Bark"
}

trait Cat extends Pet {
  override def getVoice(): String = "Myaw"
}
class Tiger extends Cat {
  override def getVoice(): String = "Roar"
}

object TraitDemo{
  def main(args: Array[String]): Unit = {
    val dog = new Tiger
    println("======== "+ dog.getVoice())
  }
}