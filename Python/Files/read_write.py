# Utility File
# Collection of Commonly Used Functions

# File Input

def readFile(filename):
    fileContents = ''
    
    with open(filename) as myFile:
        fileContents = myFile.read()
        myFile.close()
    
    return fileContents


# TEST METHOD
def writeFile(filename, contents, method):
	
	with open(filename, method) as myFile:
		myFile.write(contents)
		myFile.close()


def main():
    print('Running utility file')

if __name__ == '__main__':
    main()
