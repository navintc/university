#shuddave used a while loop instead of a for loop

alphabet = ['a','b','c','d','e','f','g','h','i','j','k','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
encoder = ['z','y','x','w','v','u','t','s','r','q','p','o','n','m','k','j','i','h','g','f','e','d','c','b','a']
senten = "Our Help Cometh from the lord -Angri Yasmi"

senten.lower()

listsen = list(senten)

k=0

for encodee in listsen:
    flagJ=0
    for letter in alphabet:
        if encodee == letter :
            listsen[k]=encoder[flagJ]  
        flagJ+=1
    k+=1
    
    
print(encodedShitSentence)

encodedShit = list(encodedShitSentence)

k=0
for encodee in encodedShit:
    flagJ=0
    for letter in encoder:
        if encodee == letter :
            encodedShit[k]=alphabet[flagJ]  
        flagJ+=1
    k+=1
print("".join(encodedShit))


