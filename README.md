# Warp
POO Avancée - Projet WARP
Travail : Bloc B - Héritage
8INF957 : Programmation objet avancée
Pondération : 10%
Consignes :
• Travail en équipe de 3
• Date de remise : semaine 8 (27 octobre)
• Remise par Teams
o Un seul projet, compilé et
fonctionnel
o Le diagramme de classes de votre
solution
o Des captures d’écran du
fonctionnement de votre projet Java
Le WARP
Nous sommes an 41e
siècle et l’humanité arpente l’espace et a rencontré une pléniade de races
extraterrestres. Une dimension immatérielle, nommé le Warp, a aussi été découverte et est
exploitée par plusieurs races. Elle est peuplée d’entités puissantes qui offrent écoute, pouvoir
et connaissance aux êtres dignes de leur attention.
Il existe plusieurs grandes races
• Les psykers de l’humanité communiquent avec leur empereur-Dieu
• Les eldars harlequins venèrent Cegorach, le dieu moqueur
• Les orks se battent pour les dieux jumeaux Gork et Mork
• Les tyranides sont reliés par un lien synaptique à l’esprit de la ruche
• Les agents du chaos vénèrent Khorne, le dieu de la guerre
Chaque race vénère le Warp à sa façon et sous une forme différente.
Les entités du Warp réalisent les tâches suivantes pour leurs fidèles (adapter à votre gout,
minimum 5 tâches pour chaque entité)
• Fournir des conseils sans aucune raison
• Fournir des conseils en fonction de la demande
• Réaliser des miracles
• Écouter les besoins sans répondre
• Écouter les besoins et répondre un conseil
• Écouter les besoins et réaliser un miracle
• Etc (ajouter au moins 3 autres tâches pour votre travail)
Travail – Bloc B – Héritage
8INF957 Programmation objet avancée Session A-2021
Le fonctionnement
À partir du patron de conception « Singleton »
fourni au bloc A (voir projet GoF), concevoir et
programmer trois races (choisir dans les cinq
disponibles) et inventez-en une de votre cru.
• MonServeur est le Warp
• Le package monserveur est le package
warp
• Les Services sont : Conseil, Miracle,
Ecoute et <un autre de votre choix>
• Chaque race peut accéder au Warp via le
main.
• Le package du Warp ne peut contenir
que le Warp, les services et les interfaces
• Utiliser le main pour tester votre solution
o Libérer votre « main » de code d’implémentation. En français, cacher le code
d’utilisation du Warp dans une autre classe (ex : GorkMork)
o orkZodgrod.communiquerGorkMork().waaag(); // OK mais juste exemple
o Warp.Conseil().demander("Dois-je faire la paix"); // PAS OK
Conseils d’ami
• Ce projet est assez simple si vous prenez la peine de lire et de bien comprendre le projet
fourni. Pas seulement lire le code, comprendre chaque subtilité.
• Ensuite, lorsque vous aurez compris la matrice, vous pourrez adapter le code (et bien sur
mettre des noms de classe significatifs)
