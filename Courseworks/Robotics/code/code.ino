int MotorAip1=7; //Right motor
int MotorAip2=8;
int MotorBip1=9; //Left motor
int MotorBip2=10;

int IR1=12;      //Right sensor
int IR2=13;    //left Sensor

int enablerA = 6;
int enablerB = 5;

long duration; // variable for the duration of sound wave travel
int distance;
int distanceExpect = 12;

int bendspeed = 115;
int normspeed = 120;

int echoPin = 2; // attach pin D2 Arduino to pin Echo of HC-SR04
int trigPin = 3;

void setup() {
  // put your setup code here, to run once:
  pinMode(MotorAip1,OUTPUT);
  pinMode(MotorAip2,OUTPUT);
  pinMode(MotorBip1,OUTPUT);
  pinMode(MotorBip2,OUTPUT);

  pinMode(enablerA, OUTPUT);
  pinMode(enablerB, OUTPUT);

  pinMode(trigPin, OUTPUT); // Sets the trigPin as an OUTPUT
  pinMode(echoPin, INPUT); // Sets the echoPin as an INPUT
  Serial.begin(9600); // // Serial Communication is starting with 9600 of baudrate speed
  
}

void loop() {
  // put your main code here, to run repeatedly:

//  ultrasonicChecker();
//
//  if (distance == distanceExpect){
//    while(true){
//      stop();
//    }
//  }
  
  if (digitalRead(IR1)==LOW && digitalRead(IR2)==LOW){
    analogWrite(enablerA, normspeed);
    analogWrite(enablerB, normspeed);
    front();
    
  }else if (digitalRead(IR1)==HIGH && digitalRead(IR2)==HIGH){
    stop();
    
  }else if (digitalRead(IR1)==HIGH && digitalRead(IR2)==LOW){
    analogWrite(enablerA, bendspeed);
    analogWrite(enablerB, bendspeed);
    right();
  }else if (digitalRead(IR1)==LOW && digitalRead(IR2)==HIGH){
    analogWrite(enablerA, bendspeed);
    analogWrite(enablerB, bendspeed);
    left();
    
  }

}

//int ultrasonicChecker(){
//  // Clears the trigPin condition
//  digitalWrite(trigPin, LOW);
//  delayMicroseconds(2);
//  // Sets the trigPin HIGH (ACTIVE) for 10 microseconds
//  digitalWrite(trigPin, HIGH);
//  delayMicroseconds(10);
//  digitalWrite(trigPin, LOW);
//  // Reads the echoPin, returns the sound wave travel time in microseconds
//  duration = pulseIn(echoPin, HIGH);
//  // Calculating the distance
//  distance = duration * 0.034 / 2; // Speed of sound wave divided by 2 (go and back)
//  // Displays the distance on the Serial Monitor
//  Serial.print("Distance: ");
//  Serial.print(distance);
//  Serial.println(" cm");
//  return 0;
//}

int front(){
    digitalWrite(MotorAip1,HIGH);
    digitalWrite(MotorAip2,LOW);
    digitalWrite(MotorBip1,HIGH);
    digitalWrite(MotorBip2,LOW);
//    analogWrite (enA, 200);
//    analogWrite (enB, 200);
    delay(100);

    return 0;

}


int left(){
    //Tilt robot towards right by stopping the right wheel and moving the left one
    digitalWrite(MotorAip1,LOW);     // If I want to turn right then the speed of the right wheel should be less than that of the left wheel, here, let a be the right wheel
    digitalWrite(MotorAip2,HIGH);
    digitalWrite(MotorBip1,HIGH);
    digitalWrite(MotorBip2,LOW);
//    analogWrite (enA, 150);
//   analogWrite (enB, 200);
    delay(100);

   return 0;
}

int right(){

    digitalWrite(MotorAip1,HIGH);     
    digitalWrite(MotorAip2,LOW);
    digitalWrite(MotorBip1,LOW);
    digitalWrite(MotorBip2,HIGH);
//    analogWrite (enA, 200);
//    analogWrite (enB, 150);
   delay(100);

   return 0;
  
}


int stop(){
  //Stop both Motors
    digitalWrite(MotorAip1,LOW);
    digitalWrite(MotorAip2,LOW);
    digitalWrite(MotorBip1,LOW);
    digitalWrite(MotorBip2,LOW);
    delay(100);

 }
