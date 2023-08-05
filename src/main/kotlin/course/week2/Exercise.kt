package course.week2

class Player(var name:String,var surName: String){

    var totalScore = 0
    var personalBestScore = 0

    fun fullName():String{
        return "$name $surName"
    }
}

class Scores(){
    fun checkBest(best:Int,current:Int):Int{
        if (best<current){
            return current
        }
        return best
    }
}

fun main(){
    val p1 = Player("Nikola","Tesla")
    val p2 = Player("Thomas","Edison")

    val scoring = Scores()

    var lvlScores = 0


    //level 1
    lvlScores = 20
    p1.totalScore+=lvlScores
    p1.personalBestScore = scoring.checkBest(p1.personalBestScore,lvlScores)

    lvlScores = 4
    p2.totalScore+=lvlScores
    p2.personalBestScore = scoring.checkBest(p2.personalBestScore,lvlScores)

    //level 2
    lvlScores = 35
    p1.totalScore+=lvlScores
    p1.personalBestScore = scoring.checkBest(p1.personalBestScore,lvlScores)

    lvlScores = 8
    p2.totalScore+=lvlScores
    p2.personalBestScore = scoring.checkBest(p2.personalBestScore,lvlScores)


    //level 3
    lvlScores = 25
    p1.totalScore+=lvlScores
    p1.personalBestScore = scoring.checkBest(p1.personalBestScore,lvlScores)

    lvlScores = 1
    p2.totalScore+=lvlScores
    p2.personalBestScore = scoring.checkBest(p2.personalBestScore,lvlScores)

    if (p1.totalScore>p2.totalScore){
        println("The winner is "+ p1.fullName() +  " with a Score of  "+p1.totalScore);
        println("Personal Best Score is = " +p1.personalBestScore);
    }
}