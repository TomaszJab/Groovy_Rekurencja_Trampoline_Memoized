import groovy.transform.*;

printBinaryform = { number, def accu = "" ->
    def remainder=""
    if (number == 1) {
        return (number % 2).toString()+accu
    }

    remainder = (number % 2).toString()
    printBinaryform.trampoline(number >> 1,remainder+accu)
}.trampoline()

number = 100000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000
System.out.println("Positive number "+"\n"+number)


System.out.println("Convert to binary is:" );
printBinaryform = printBinaryform(number)

println printBinaryform