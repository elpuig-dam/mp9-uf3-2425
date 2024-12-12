>**Tasca 1 TCP**  
>L'Objecte [Llista.java](src/mp9/uf3/tcp/exemples/Llista.java) consta d'un __nom__(String) i una __llista de numeros__(List-Integer-)
> - Implementar un servidor TCP perquè permeti comunicar-se amb diferents clients alhora. Aquests li enviaran un objecte de tipus Llista, i el servidor els hi retornarà el mateix objecte amb els números ordenats i sense repetits.
> - Implementar el client amb TCP que enviï al servidor una Llista omplerta amb les dades (nom i llista de números),
    > i preparat per rebre un objecte del mateix tipus. El servidor li haurà eliminat els repetits i els números estaran
    > ordenats. Imprimiu per la consola els resultats per veure el correcte funcionament.