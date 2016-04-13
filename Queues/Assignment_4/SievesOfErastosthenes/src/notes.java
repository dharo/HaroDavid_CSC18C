/*
    Assignment 4
    Sieves of Erastosthenes
    Fill a queue with n integers and then use the Sieves of Erasthones
    to find all primes up to n.
Planning start = 11:00am
Stopped Coding = 12:00pm

Z = Set of integers
P = Set of Primes

Create a QueueOfZ from 2 to n.
Create and empty QueueOfP.
Do{
    grab first number from QueueOfZ (which is 2 @ beginning)
    for(i = firstZ; i<n;i++){
        if the mod results in 0, remove the integer value from the QueueofZ;
        
    }
    if (end of QueueOfZ is reached)
        Enqueue the first number in the QueueOfZ to QueueOfP;
}while(QueueOfPrimes.back() < sqrt(n)); //Repeat until you reach the sqrt(n)

Treat as Circular Queue
For looping through the queue and removing integers that are not prime
    if the number is modded by the prime and equals to 0, dequeue it from QoZ
    if the number is modded by the prime and is not equal to 0, push_back() to QoZ and enqueue to QoP


1. Create boolean flag for knwoing endOfQ
2. Grab first number in QoZ and enqueue to QoP
3. Use last value inserted to QoP to compare values in QoZ
4. Assign/hold current QoZ.front() to a new variable.
    because the QoZ.front() will be thrown to the back, this will allow the program
    to know when it has circled ot the front again
    do{
        if QoZ.value % QoP.tail == 0, dequeue Qoz.value
        if QoZ.value % QoP.tail != 0, push_back() to QoZ
        if current_head == QoZ.front(), endOfQ = true
    }while(!endOfQueue);
5. Repeat until QoP.tail > sqrt(n);

*/