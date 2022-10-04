# files can be opened in python in binary mode
# read() will return a bytes object - array of 8-bit integers
# .decode will convert the bytes object into a python string
# .write is used to write raw data to a file
# .see() is used to position the next read
# .tell() is used to detmine where in the file you currently are
#
# i.e:
# if data is read from a network application, such as getting the HTML source of a webpage, it is retrieved as binary
# data. data is encoded as ASCII or UTF-8, which is represented as a bytes object (an array of bytes). then, decode
# is called to convert the bytes object into a string.
#
# when going the other way, the Python string needs to be converted to a string of bytes. this, for example, would be
# done when writing text out to a network application. to do this the encode() method is used.
#
# if processing a raw binary file, the struct class is used. this can be used to pack or upack data, and the format
# string is used. this is simply a string of data which describes the data layout using codes. each code is a letter
# representing a data type, can be preceded with size or repetition count, and a prefix specifying the byte order and
# alignment. Byte order can be native or standard. Native refers to the byte order and alignment used by the C
# compiler on the current platform, whereas standard refers to a standard set of sizes. If no byte type and alignment
# # is specified then native is presumed by default. the code is a letter, which tells the struct() what type of data
# it is, such as a character, integer, float, or bool. not all codes are available on all platforms.
#
# lets look at an example

from struct import Struct
# import struct
values = 7, 6, 42.3, b'Guido'
# set the values we want to pack
demo = Struct('iif10s')
# create a variable called demo, setting it's struct as i, i, f, 10s <- that's two lots of integer, one float, and 10
# bytes of a character
print("Size of data: {} bytes".format(demo.size))
# this simply tells the console to print out the words "Size of data: {} bytes" with the '{}' replaced with the actual
# size of the data in bytes
binary_stream = demo.pack(*values)
# here we create the variable 'demo stream' which is created by packing the variable values, following the format of
# demo
print(binary_stream)
# this simply prints binary_stream to confirm that it has been converted to binary as expected
int1, int2, float1, raw_bytes = demo.unpack(binary_stream)
# we now specify the values int1, int2, float1, and raw_bytes as the respective output of unpacked binary_stream
# we know we packed 7, 6, 42.3, and b'Guido' into binary_string, so we can expect these to be the output
str1 = raw_bytes.decode().rstrip('\x00')
# this then set the variable 'str1' as equal to the variable raw_bytes when it has been decoded and the preceding
# '\x00' as seen in binary objects removed, which should return it to the initial b'Guido' input
print(int1, int2, float1, str1)
# finally, this prints the unpacked and decoded variables as originally input at the start
#
# now we explore bitwise operators. simply put, these are operators which use only a single character code to compare
# individual bits in an integer - this may be used as a flag, or to pack more information into a byte
# the 'and' (&) and 'or' (|) operators work on two integers of the same size, and return a new integer with the bits
# modified according to the operator. the 'and' operator can clear bits, used with a mask composed of 1s for all the
# bits you don't want to clear. if both numbers in both bits are set to 1, the & will return a value of 1, otherwise
# it will return a 0. the | operator sets the new integer bit to 1 if either of the first two integer bits were 1, if
# not it then sets it to 0. additionally, the caret (^) operator is used as an exclusive or feature, where it sets the
# new bit to one if the pre-existing bits were different values. additionally, ~ can be used to inverse bits, << to
# left shift, and >> to right shift.
# that's a lot of information, so lets look at an example

a = 0b10101010
b = 0b11110000
# here we are just setting the binary values of variables a and b

c = a & b
# c, then, is the & operator used to compare variables a and b

print("")
print("")
# this is two empty lines i have asked python to print simply to help seperate the output of the bitewise code from
# the previous struct code output

print("  {:08b}".format(a))
print("& {:08b}".format(b))
print("  --------")
print("  {:08b}".format(c))
print()
# this looks quite messy, but really it just prints a neat output showing you values a, b, and c for comparison

# lets run another example with the or operator
print("")
print("")
d = a | b
print("  {:08b}".format(a))
print("| {:08b}".format(b))
print("  --------")
print("  {:08b}".format(d))
print()