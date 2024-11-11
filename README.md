# Projet de Simulation de Vente - AllBoardsShop

Ce projet est une simulation d’un système de gestion de ventes pour le magasin AllBoardsShop. Il permet de modéliser des ventes de produits de sport avec différents acteurs, tels que le fournisseur, le gérant, les clients privilégiés, et un serveur de notifications. Ce système est conçu pour simuler le processus de proposition, validation et notification de ventes.

## Fonctionnalités
- Proposer une vente : Un fournisseur peut proposer une vente de plusieurs produits avec des quantités spécifiques.
- Valider une vente : Un gérant peut valider ou refuser une vente proposée.
- Notifier les clients privilégiés : Une fois la vente validée, les clients privilégiés reçoivent une notification par email.
- Gestion des produits et quantités : Chaque vente inclut une liste de produits avec leurs quantités via la classe LigneDeVente.

## Structure des Classes
- Personne : Classe abstraite de base pour les acteurs (fournisseur, gérant, client privilégié).
- Fournisseur : Propose des ventes.
- Gérant : Valide ou refuse les ventes.
- ClientPrivilégié : Reçoit les notifications de nouvelles ventes validées.
- Produit : Représente un produit vendu.
- LigneDeVente : Relie un produit à une vente avec une quantité.
- Vente : Représente une vente avec une liste de produits et leurs quantités.
- Notification : Envoie des notifications aux clients privilégiés.
- ServeurMail : Gère l’envoi des emails pour les notifications.

## Prérequis
- Java 22 ou supérieur doit être installé.

## Auteurs
- Josian RIVIERE
- Thomas ROUX
