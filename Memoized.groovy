import groovy.transform.*;
@Memoized
def printBinaryform1(number) {
    def remainder =""
    if(number == 1){
        print 1
        return
    }

    remainder = (number % 2).toString()
    printBinaryform1(number >> 1)
    print remainder
}

number=10000000000000000000000000000
System.out.println("Positive number "+number)
System.out.print("Convert to binary is:")
printBinaryform1(10000000000000000000000000000)