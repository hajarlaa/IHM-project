# IHM-project

projet réalisé par : Hajar Laatioui , Anas Hammoucha .

Introduction :
Ce code est écrit en Java et utilise l'IDE NetBeans. Il comprend des fonctions pour afficher, mettre à jour et supprimer des données d'une base de données MySQL. Le code récupère les données de la base de données et les affiche dans un JTable, et permet à l'utilisateur de sélectionner une ligne et de visualiser/mettre à jour/supprimer les données de cette ligne.

Explication du code :

table() :
Cette fonction récupère les données de la table "tablenew" de la base de données MySQL et les affiche dans un JTable.

tabledata() :
Cette fonction est appelée lorsque l'utilisateur clique sur une ligne dans le JTable. Elle récupère les données de la ligne sélectionnée et les affiche dans des zones de texte sur l'interface utilisateur.

update() :
Cette fonction est appelée lorsque l'utilisateur clique sur le bouton "Mettre à jour". Elle récupère les données mises à jour à partir des zones de texte sur l'interface utilisateur et met à jour la ligne correspondante dans la base de données MySQL.

jButton2ActionPerformed() "insert" :
Cette fonction est appelée lorsque l'utilisateur clique sur le bouton "Ajouter". Elle récupère les données saisies par l'utilisateur dans les zones de texte sur l'interface utilisateur et les insère en tant que nouvelle ligne dans la base de données MySQL.

jButton4ActionPerformed() "delete" :
Cette fonction est appelée lorsque l'utilisateur clique sur le bouton "Supprimer". Elle invite l'utilisateur à confirmer s'il souhaite supprimer la ligne sélectionnée de la base de données MySQL. Si l'utilisateur confirme, elle supprime la ligne de la base de données.

jButton3ActionPerformed() "update" :
Cette fonction est appelée lorsque l'utilisateur clique sur le bouton "Mettre à jour". Elle appelle la fonction update() pour mettre à jour la ligne sélectionnée dans la base de données MySQL.

jTable1MouseClicked() et jTable1KeyReleased() :
Ces fonctions sont appelées lorsque l'utilisateur clique sur une ligne dans le JTable ou sélectionne une ligne à l'aide des touches de direction, respectivement. Elles appellent la fonction tabledata() pour afficher les données de la ligne sélectionnée.

Conclusion :
Ce code fournit des fonctionnalités (Create, Read, Update, Delete) de base pour une base de données MySQL en utilisant Java et l'IDE NetBeans. Il permet à l'utilisateur d'ajouter, de visualiser, de mettre à jour et de supprimer des données d'une base de données en utilisant une interface utilisateur.
