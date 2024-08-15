package Task2
 fun main (){
      val  a =4;
     val b = 45;
     val c = -2;
     val d = 8;
     if (a > 0 && b >0 && c > 0 && d >0){
         println("В наборе 4 полодительных числа $a | $b | $c | $d")
     }else if (a < 0 && b >0 && c > 0 && d >0){
         ("В наборе 3 полодительных числа  $b | $c | $d")
     } else if (a > 0 && b < 0 && c > 0 && d >0){
         println("В наборе 3 полодительных числа $a | $c | $d")
     } else if (a > 0 && b > 0 && c < 0 && d >0){
         println("В наборе 3 полодительных числа $a | $b | $d")
     }else if (a > 0 && b > 0 && c > 0 && d < 0){
         println("В наборе 3 полодительных числа $a | $b | $c")
     }
 }
