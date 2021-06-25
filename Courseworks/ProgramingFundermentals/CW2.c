#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <time.h>



// global variables---------------------------------
int i, sessionTot=0;

char *products[14]= {"", "Nutrex Warrior","Psychotic Gold","Lipo-6 Black Training", "Universal Daily Formular","Muscletech Platinum Multi", "Opti-Men", "Serious Mass Gainer","ANS N Mass", "Premium Mass Gainer", "USN Anabolic Mass Chocolate", "Insane Labz Whey", "Universal Ultra Whey Pro", "USN Vibrance Collagen Peptides"};

char *catagories[14]={"","Pre Workout","Pre Workout","Pre Workout","Vitamins","Vitamins","Vitamins","Mass Gainers","Mass Gainers","Mass Gainers","Mass Gainers", "Protein", "Protein", "Womens"};

int *cart[50];

int prices[13]= {0,5500,6000,5500,3500,4000,4500,13000,13000,13000,11500, 12000, 12500, 5500};

int progLead, discreteCounter=0, strStore, storeID=0;
// end of global variables---------------------------------



// functions--------------------------------
void menuMover();
void prodList();
void catList();
void addCart();
void cartList();
void checkout();
void fileWrite(int, int);

void printCats(char[]);

void mainApp();
// end of functions--------------------------------


int main()
{

    printf("\n_________oBBBBB8o___oBBBBBBB8\n_____o8BBBBBBBBBBB__BBBBBBBBB8________o88o\n___o8BBBBBB__8BBBB__BBBBBBBBBB_____oBBBBBBBo\n__oBBBBBBB__________BBBBBBBBBB_____BBBBBBBBBBo\n_8BBBBBBBBBBooooo____BBBBBBB8_______BBB_8BBBBBBo\n_8BBBBBBBBBBBBBBBB8ooBBBBBBB8___________8BBBBBBB8\n___BBBBBBBBBBBBBBBBBBBBBBBBBB8_o88BB88BBBBBBBBBBBB\n_____BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB8\n________8BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB\n____________BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB8B\n_____________BBBBBBBBBBBBBBBBBBBBBBBB8888BB\n_____________BBBBBBBBBBBBBBBBBBBBBBBB\n______________BBBBBBBBBBBBBBBBBBBBBB\n_______________BBBBBBBBBBBBBBBBBB8B\n________________BBBBBBBBBBBBBBBBBB\n________________8BBBBBBBBBBBBBBB8B\n_________________8BBBBBBBBBBBBBBBB\n\n");

    printf("\n \n--------------------------------------------------------\n");
    printf("---------------------SUPPLIMENT STORE-------------------\n");
    printf("----------------------V. 0.10 alpha---------------------\n");
    printf("--------------------------------------------------------\n \n");

    mainApp();
}






void mainApp() {
    printf("________________________________________________________\n \n");
    printf("\nEnter number to proceed \n \n");
    printf("1. Show Products\n");
    printf("2. Show Catagories\n");
    printf("3. Add items Cart\n");
    printf("4. Show Cart\n");
    printf("5. Checkout \n \n");
    scanf("%d", &progLead);

    if (progLead==1){
        prodList();
    }
    else if (progLead==2){
        catList();
        // printf("cats");
    }
    else if (progLead==3){
        addCart();
    }else if (progLead==4){

        cartList();
        // printf("cart");
    }else if (progLead==5){
        checkout();
        // printf("checkout");
    }else{
        printf("Wrong Input");
        mainApp();
    }

}


void menuMover(){
    //moves to the main menu
    if (progLead == 999){
        printf("________________________________________________________________________\n \n");
        mainApp();
    }

    //moves to product list
    if (progLead == 888){
        printf("________________________________________________________________________\n \n");
        prodList();
    }

    //moves to catagory list
    if (progLead == 777){
        printf("________________________________________________________________________\n \n");
        catList();
    }

    if (progLead == 5000){

        FILE *fp;

        fp=fopen("logBook.txt", "a");
        if(fp == NULL)
            printf("File doesn't exist");

        fprintf(fp, "\n\nEND OF SESSION---------- Sub total: %d\n", sessionTot);
        fprintf(fp, "___________________________________________________\n\n");
        fclose(fp);

        exit(0);
    }
}

// MENUS*******************************************************************

//will display all the products with their data
void prodList(){
    printf("\n \n______________________PRODUCTS___________________________\n \n");
    progLead = 0;
    for (discreteCounter=1; discreteCounter<13; discreteCounter++){
        printf("%d. %s \n", discreteCounter, products[discreteCounter]);
        printf("Catagory: %s |  Price: Rs.%d \n \n", catagories[discreteCounter], prices[discreteCounter]);
    }

    printf("\nEnter number 999 to go back to main menu: ");
    scanf ("%d", &progLead);
    menuMover();

}


//will display the catagories and will take inputs to extend the display
void catList(){
    printf("------------------------------------- \n \n");
    printf("Catagories \n");
    printf("1. Protien \n");
    printf("2. Mass Gainers \n");
    printf("3. Vitamins \n");
    printf("4. Pre Workout \n");
    printf("5. Women's \n \n");
    scanf("%d", &progLead);

    char protien[]="Protein";
    char massG[]="Mass Gainers";
    char vita[]="Vitamins";
    char prework[]="Pre Workout";
    char womens[]="Womens";

    if (progLead==1){
        printCats(protien);
    }else if (progLead==2){
        printCats(massG);
    }else if (progLead==3){
        printCats(vita);
    }else if (progLead==4){
        printCats(prework);
    }else if (progLead==5){
        printCats(womens);
    }else{
        printf("Wrong Input");
        catList();
    }
}

void cartList(){
    int k,itemCount=0;
    printf("\n------------------------------------- \n");
    printf("\nCart----------------------------- \n");

    for (i=0;i<49;i++){
        if (cart[i]!=0){
            k=cart[i];
            printf("%s (%s) - Rs.%d \n", products[k],catagories[k], prices[k]);

            itemCount+=1;
        }
    }

    printf("\n------------------------------------- \n \n");
    printf("\nEnter number 999 to go back to main menu: ");
    scanf ("%d", &progLead);
    menuMover();



}

// END OF MENUS*************************************************************

void addCart(){
    printf("\n------------------------------------- \n");
    printf("Enter product IDs to add to cart.\nEnter 100 to stop adding.\nMaxium item count for a bill is 50.\n\n");

    i=0;

    scanf("%d", &storeID);
    while (i<50){
        if (storeID!=100){
            cart[i]=storeID;
            i+=1;
            scanf("%d", &storeID);
        }else if (storeID==100){
            i=50;
        }
    }

    printf("\n\nStoped adding items.\n");
    mainApp();

}




// uses to print out elements from each catagory by taking a char parameter
void printCats(char *catName){
    // printf("Wrrrrrong Input");
    printf("------------------------------------- \n");
    printf("%s ----------------------------- \n \n", catName);

    for (discreteCounter=0; discreteCounter<14; discreteCounter++){
        if ( strcmp (catagories[discreteCounter], catName)==0){
            printf("%s \n", products[discreteCounter]);
        }
    }
    printf("\n------------------------------------- \n");
    printf("Enter 777 to go back, and 999 to go to main menu.\n");
    scanf("%d", &progLead);
    menuMover();
}


// --------------------------------------------------------------------------

// Checkout

void checkout(){

    // local variables
    time_t t = time(NULL);
    struct tm likeRightNow = *localtime(&t);
    int total,k,l,spaces,itemCount=0;

    printf("\n \n \n \n-----------------------------------------------------------------\n");
    printf("--------------------------SUPPLIMENT STORE-----------------------\n");
    printf("------------------------------THE BILL---------------------------\n");
    printf("-----------------------------------------------------------------\n \n");
    printf("| Billed at: %d-%02d-%02d %02d:%02d:%02d \n \n \n", likeRightNow.tm_year + 1900, likeRightNow.tm_mon + 1, likeRightNow.tm_mday, likeRightNow.tm_hour, likeRightNow.tm_min, likeRightNow.tm_sec);

    for (i=0;i<49;i++){
        if (cart[i]!=0){
            k=cart[i];




            printf("%s", products[k]);


            //printing sapces
            spaces=50-strlen(products[k]);
            for (l=0;l<spaces;l++){
                printf(" ");
            }


            printf("Rs.%d \n", prices[k]);

            total += prices[i];
            itemCount+=1;
        }
    }
    printf("\n\t\t\t\t\t     __________________");
    printf("\nSUB TOTAL: \t\t\t\t\t  Rs.%d\n", total);
    printf("Number of items sold: %d", itemCount);
    printf("\n \n-----------------------------------------------------------------\n");
    printf("-----------------------------------------------------------------\n\n\n\n");



    printf("\n------------------------------------- \n \n");

    fileWrite(itemCount, total);
    sessionTot+=total;

    printf("\nEnter number 999 to go back to main menu.\nEnter 5000 to Exit the Program\n");
    scanf ("%d", &progLead);
    menuMover();

}




void fileWrite(int itemCount, int total){

    FILE *fp;

    fp=fopen("logBook.txt", "a");
    if(fp == NULL)
        printf("File doesn't exist");

    fprintf(fp, "BILL--- total: %d | Item Count: %d \n", total, itemCount);
    printf("Written data into the logBook.txt \n\n");

    fclose(fp);
}








