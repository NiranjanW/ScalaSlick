def sumInt(lst:List[Int]) : Int = lst.foldRight(0)( _ +  _)

def sumString(list : List[String]) :String = list.foldRight("")(_ ++ _)

def unionSet[A](lst:List[Set[A]]) : Set [A] = lst.foldRight(Set.empty[A])(_ union _)
val lst:List[Int] = (List(1,2,3))
val lstStr = List("Hello" , "World")

print(lst.sum , sumString (lstStr))

//trait combine()

def foo:Runnable = {
  object Runner extends Runnable {

    def run :Unit =     print("Hello")
  }
  Runner
}
foo.run()