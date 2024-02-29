# Data-Encryption-Standard

**What is DES?**

Data Encryption Standard (DES) is a block cipher with a 56-bit key length that has played a significant role in data security. Data encryption standard (DES) has been found vulnerable to very powerful attacks therefore, the popularity of DES has been found slightly on the decline. DES is a block cipher and encrypts data in blocks of size of 64 bits each, which means 64 bits of plain text go as the input to DES, which produces 64 bits of ciphertext. The same algorithm and key are used for encryption and decryption, with minor differences. The key length is 56 bits. 

**Workflow of DES:**

![Steps-in-DES](https://github.com/BunsGlazin/Data-Encryption-Standard/assets/145743047/262d7b8d-d439-4f81-8c1b-2f18f8c31a5b)

**Server.java**

This file performs the encryption and decryption of the 64 bit plain text, printing the result of the HEX string after every round of encryption and decryption.

**Client.java**

This file gets the input of an 8-letter (64 bits) plain text and forwards it to the server side where it is encrypted and decrypted.
