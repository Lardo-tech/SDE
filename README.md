Samenwerking: 

Gijs van de Meule:

Lars de Hond:

Uitleg project:
In dit project hebben we een kleine quiz gemaakt waarin de gebruiker kan kiezne tussen verschillende categorieen 
namelijk: Music en Soccer. De gebruiker kiest een van de twee en krijgt dan een quiz met vragen over de gekozen 
categorie. De vragen worden opgehaald uit een database en worden dan in de quiz geladen.
De gebruiker kan dan de vragen beantwoorden en krijgt dan direct te zien of het antwoord goed was of niet. Voor het 
maken van de quiz hebben we gebruik gemaakt van de Builder Pattern, de Template Method en een facade.

Creational: 
- Builder Pattern: Voor het Kopje creational hebben we gekozen om e builder te gebruiken. De builder Zorgt er voor dat er twee verschillende quiz types gemaakt kunnen worden namelijk de SoccerQuiz en de MusicQuiz. De gebruiker kiest welke hij wilt spelen en de QuizDirector stuurt de juiste Builder aan om zijn quiz te maken. Als de gebruiker kiest voor de SoccerQuizwordt de SoccerBuilder aangeroepen en andersom. 

Behavioral: 
- Template Method: Voor het kopje behavioral hebben we gekozen om de Template Method te gebruiken, deze maakt namelijk een voorbeeld van hoe de quizvragen er uit moeten komen te zien en daar moeten de MusicBuilder en de SoccerBuilder zich dan aan houden. Het voordeel is dat je op deze mannier twee dezelfde quizzen krijgt maar dan elk met eigen inhoud, hierdoor heb je tegelijkertijd ook minder last van code duplicatie. 
- Observer: Voor het kopje behavioral hebben we er ook voor gekozen om een Observer te gebruiken, deze zorgt er voor dat er een score wordt bijgehouden als de gebruiker het juiste antwoord invult bij een vraag. Vervolgens wordt aan het einde de totale socre getoond.

Structural:
- Facade: Voor het kopje structural hebben we gekozen om de Facade te gebruiken, deze zorgt er namelijk voor dat de gebruiker maar een paar methodes hoeft aan te roepen om de quiz te kunnen spelen. De gebruiker hoeft alleen de methodes QuizOption en conductQuiz aan te roepen en de rest wordt dan voor hem gedaan. De facade zorgt er voor dat de juiste builder wordt aangeroepen en dat de juiste vragen worden opgehaald uit de database.

Onze samenwerking:

De samenwerking is soepel verlopen. Vanaf het begin was duidelijk wat voor soort programma we wilden gaan maken. Daarna
Hebben we uitgezocht wat voor design paterns hier bij zouden passen. Vervolgens hebben we deze verdeeld en beide twee 
design patterns geimplementeerd.