# design-pattern-chainofresponsibility
What is Chain of Responsibility design pattern?
Chain of Responsibility - Behavioral Patterns
Chain of Responsibility is a behavioral design pattern that lets you pass requests along a chain of handlers. Upon receiving a request, each handler decides either to process the request or to pass it to the next handler in the chain.


Est utilisé pour obtenir un couplage faible dans la conception de logiciel ou une demande du client est transmise à une chaine d’objet pour les traitées , puis l’objet de la chaine decidra lui-même qui traitera la demande et si la demande doit etre envoyer à l’objet suivant de la chaine ou non
Exemple try catch en java : 
Si on a plusieurs try catch et on va catcher plusieurs exception , la premiere fois il essaye de catcher par exemple l’exception null pointer exception , s’il n’existe pas il va passer un catch suivant .

exemple atm:
Ou bien dans le distributeur si un client va faire un retrait de 315 euro , donc dans l’atm il va donner des billets de 50 euro si le reste et inférieur à 50 il passe à 20 et ainsi de suite jusqu’au 5 euro

![image](https://user-images.githubusercontent.com/36199753/151709810-b30b7014-610e-40d6-906d-f7a8872e1c53.png)
