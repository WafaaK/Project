# Project
# VHDL
# Additionneur en VHDL

Ce projet contient des implémentations en VHDL d'un half adder (demi-additionneur) et d'un full adder (additionneur complet). Le projet a été réalisé en utilisant Xilinx ISE 8.1i pour la synthèse et la simulation.

## Table des Matières

- [Introduction](#introduction)
- [Xilinx ISE 8.1i](#xilinx-ise-81i)
- [Prérequis](#prérequis)
- [Installation](#installation)
- [Utilisation](#utilisation)
- [Contribuer](#contribuer)
- [Licence](#licence)

## Introduction

### Half Adder

Un half adder est un circuit combinatoire qui effectue l'addition de deux bits. Il a deux bits d'entrée, A et B, et produit deux bits de sortie, la somme (Sum) et la retenue (Carry).

### Full Adder

Un full adder est un circuit combinatoire qui effectue l'addition de trois bits. Il a trois bits d'entrée, A, B, et CarryIn, et produit deux bits de sortie, la somme (Sum) et la retenue (CarryOut).

## Xilinx ISE 8.1i

Xilinx ISE (Integrated Synthesis Environment) 8.1i est un outil de développement utilisé pour la conception de circuits logiques programmables, tels que les FPGA et CPLD de Xilinx. Il fournit un ensemble complet d'outils pour la conception, la synthèse, la simulation et l'implémentation de circuits logiques. Bien que Xilinx ISE soit une version plus ancienne, elle reste un outil puissant pour les conceptions FPGA classiques.

### Fonctionnalités Principales de Xilinx ISE 8.1i

- **Saisie de Schéma et Conception VHDL** : Permet de créer des circuits à l'aide de schémas ou de code VHDL.
- **Synthèse et Implémentation** : Outils pour convertir la conception en une configuration spécifique pour les FPGA/CPLD.
- **Simulation** : Simulation de la conception pour vérifier son comportement avant l'implémentation sur le matériel.
- **Gestion des Contraintes** : Permet de spécifier les contraintes de timing et d'emplacement pour optimiser la performance du circuit.

## Prérequis

- Xilinx ISE 8.1i installé
- Connaissances de base en VHDL

## Utilisation

1. **Synthèse et Simulation** :
   - Ouvrez les fichiers VHDL pour le half adder et le full adder.
   - Lancez la synthèse et la simulation dans Xilinx ISE 8.1i pour vérifier le fonctionnement des additionneurs.
  

# Sensors 
# Projet de Capteurs : Light Lux et Accéléromètre

Ce projet contient des exemples d'utilisation de deux capteurs : un capteur de lumière (light lux) et un accéléromètre. Il décrit les fonctionnalités de chaque capteur, ainsi que la manière de les interfacer avec un microcontrôleur ou un autre système embarqué.
## Capteur de Lumière (Light Lux)

### Description

Le capteur de lumière (light lux) est utilisé pour mesurer l'intensité lumineuse en lux. Il est couramment utilisé dans des applications telles que les systèmes d'éclairage automatisés, les appareils photo et les dispositifs de surveillance de l'environnement.

### Caractéristiques

- **Gamme de mesure** : 0 à 100 000 lux
- **Précision** : ±10%
- **Interface** : I2C ou analogique
- **Consommation d'énergie** : Faible consommation
- **Tension de fonctionnement** : 3.3V ou 5V

## Accéléromètre

### Description

Un accéléromètre mesure l'accélération sur plusieurs axes (généralement trois : X, Y et Z). Il est utilisé dans des applications telles que les capteurs de mouvement, les dispositifs portables et les systèmes de navigation inertielle.

###Caractéristiques

- **Axes** : 3 axes (X, Y, Z)
- **Gamme de mesure**: ±2g, ±4g, ±8g, ±16g
- **Interface** : I2C ou SPI
- **Consommation d'énergie** : Faible consommation
- **Tension de fonctionnement** : 3.3V ou 5V

