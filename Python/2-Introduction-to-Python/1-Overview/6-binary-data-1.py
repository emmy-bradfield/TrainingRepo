from struct import Struct
values = 7, 6, 42.3, b'Guido'
demo = Struct('iif10s')
print("Size of data: {} bytes: ".format(demo.size))
binary_stream = demo.pack(*values)
intl1, intl2, float1, raw_bytes = demo.unpack(binary_stream)
str1 = raw_bytes.decode().rstrip('\x00')
print(intl1, intl2, float1, str1)

s = Struct('=HIHHI')

with open('../DATA/chimp.bmp','rb') as CHIMP:
    chimp_bmp = CHIMP.read(14)

(signature, size, reserved1, reserved2, offset) = s.unpack(chimp_bmp)
print("Signature: ", signature)
print("Size: ", size)
print("Reserved1: ", reserved1)
print("Reserved2: ", reserved2)
print("Offset: ", offset)