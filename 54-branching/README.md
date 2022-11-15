# Esercizio con Git, in locale

Per ogni passo,
si annoti in questo file il comando utilizzato ed il suo output,
per confrontarlo con le soluzioni.

### Si crei una nuova directory
mkdir dir
### Si inizializzi un repository Git dentro la cartella suddetta.
cd dir
git init
### Si osservi lo stato del repository
git status
### Si scriva un file `HelloWorld.java` contenente un `main` con una stampa a video e si osservi il contenuto del repository
git status
### Si aggiunga `HelloWorld.java` allo stage, e si osservi lo stato del repository
git add HelloWorld.java
### Si crei il primo commit, con messaggio ragionevole. Se necessario, si configuri nome utente ed email di git usando i dati dell'account istituzionale.
git commit -m "added helloworld, first commit"
### Si compili il file Java e si verifichi lo stato del repository
javac HelloWorld.java
git status
### Si noti che c'è un file rigenerabile (`HelloWorld.class`). Si costruisca una lista di file ignorati che ignori tutti i file con estensione `.class`
touch .gitignore -->(*.class)
### Si osservi lo stato del repository
git status
### Si crei un nuovo commit che tracci il la ignore list, aggiungendo allo stage i file necessari. Si osservi sempre lo stato del repository dopo l'esecuzione di un comando
git add .gitignore
### Si gestiscano i caratteri di fine linea in modo appropriato, creando un file `.gitattributes`
* text=auto eol=lf
*.[cC][mM][dD] text eol=crlf
*.[bB][aA][tT] text eol=crlf
*.[pP][sS]1 text eol=crlf
### Si osservi la storia del repository usando `git log --all --graph`

### Da questo punto in poi, prima e dopo ogni comando, ci si assicuri di osservare lo stato del repository con `git status`

### Si crei un file Mistake.java, con contenuto arbitrario, lo si aggiunga al tracker, e si faccia un commit
touch Mistake.java
git add Mistake.java
git commit -m "..."
### Si rinomini `Mistake.java` in `ToDelete.java`, e si faccia un commit che registra la modifica
rinomino nel pc poi git add Mistake.java ToDelete.java
git commit
### Si elimini `ToDelete.java` e si registri la modifica in un commit
rm ToDelete.java
git add ToDelete.java
git commit
### Si osservi la storia del repository e si identifichi il commit dove è stato creato `Mistake.java`. Per una visione compatta, si usi l'opzione `--oneline`
git log --oneline --all --graph
### Si ripristini Mistake.java dal commit identificato al passo precedente
git checkout d160529
### Si rimuova il file ripristinato e si ripulisca lo stage
rm mistake.java
git add Mistake.java
git commit
### Si torni al commit precedente a quello in cui `Mistake.java` è stato creato. Si utilizzi la storia del repository se utile.
git checkout a341d6d
### Si crei un nuovo branch di nome `experiment` e si agganci la `HEAD` al nuovo branch
git branch experiment
git checkout experiment
### Si crei un file README.md con contenuto a piacere, e si faccia un commit che lo includa
touch readme.md
git add readme.md
git commit -m "added readme.md"
### Si torni sul branch master e si elenchino i branch disponibili
git checkout master
git branch -v
### Si unisca il branch experiment al branch master (si faccia un merge in cui experiment viene messo dentro master, e non viceversa)
git merge experiment
### Si osservi la storia del repository
