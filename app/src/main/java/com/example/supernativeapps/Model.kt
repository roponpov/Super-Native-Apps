package com.example.supernativeapps

data class Hobby(var title : String,var description : String, var image : String)

object Supplier {
    var hobbies = listOf<Hobby>(
        Hobby("John Doe", "Hello, My Name is John. I enjoy hiking and exploring nature.", "man"),
        Hobby("Michael Smith", "Hello, My Name is Michael. I am passionate about photography.", "man"),
        Hobby("David Brown", "Hello, My Name is David. I love playing guitar.", "man"),
        Hobby("Robert Jones", "Hello, My Name is Robert. I like fishing during weekends.", "man"),
        Hobby("James Garcia", "Hello, My Name is James. I am a software engineer.", "man"),
        Hobby("William Johnson", "Hello, My Name is William. I am into fitness and bodybuilding.", "man"),
        Hobby("Richard Lee", "Hello, My Name is Richard. I enjoy reading science fiction novels.", "man"),
        Hobby("Joseph Walker", "Hello, My Name is Joseph. I love cooking and experimenting with recipes.", "man"),
        Hobby("Charles Harris", "Hello, My Name is Charles. I am a chess enthusiast.", "man"),
        Hobby("Thomas Martinez", "Hello, My Name is Thomas. I enjoy gardening in my free time.", "man"),
        Hobby("Christopher Hall", "Hello, My Name is Christopher. I am a traveler and blogger.", "man"),
        Hobby("Daniel Allen", "Hello, My Name is Daniel. I love watching and playing basketball.", "man"),
        Hobby("Matthew Young", "Hello, My Name is Matthew. I am an artist specializing in painting.", "man"),
        Hobby("Anthony King", "Hello, My Name is Anthony. I enjoy playing video games.", "man"),
        Hobby("Mark Wright", "Hello, My Name is Mark. I have a passion for photography and cinematography.", "man"),
        Hobby("Paul Hill", "Hello, My Name is Paul. I am an avid runner and marathon enthusiast.", "man"),
        Hobby("Steven Scott", "Hello, My Name is Steven. I am a DIY craftsman.", "man"),
        Hobby("Andrew Adams", "Hello, My Name is Andrew. I love building model airplanes.", "man"),
        Hobby("Joshua Lopez", "Hello, My Name is Joshua. I am a coffee connoisseur.", "man"),
        Hobby("Kevin Clark", "Hello, My Name is Kevin. I enjoy playing the drums.", "man"),
        Hobby("Brian Rodriguez", "Hello, My Name is Brian. I am a graphic designer.", "man"),
        Hobby("George Lewis", "Hello, My Name is George. I enjoy exploring history museums.", "man"),
        Hobby("Edward Walker", "Hello, My Name is Edward. I am a car enthusiast and collector.", "man"),
        Hobby("Jason Robinson", "Hello, My Name is Jason. I love writing poetry.", "man"),
        Hobby("Ryan Thompson", "Hello, My Name is Ryan. I am a science teacher and stargazer.", "man"),
        Hobby("Gary White", "Hello, My Name is Gary. I enjoy skateboarding.", "man"),
        Hobby("Nicholas Green", "Hello, My Name is Nicholas. I am a robotics hobbyist.", "man"),
        Hobby("Eric Baker", "Hello, My Name is Eric. I love solving puzzles and riddles.", "man"),
        Hobby("Stephen Perez", "Hello, My Name is Stephen. I am a martial arts enthusiast.", "man"),
        Hobby("Timothy Carter", "Hello, My Name is Timothy. I enjoy learning new languages.", "man")

    )
}