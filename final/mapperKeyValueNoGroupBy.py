import glob
import csv
file_list = [f for f in glob.glob("c:\desktop\\*.csv")]
file_open = []
outputFile=open("c:\desktop","w")
for name in file_list:
    file_open.append(open(name, "r"))
for file in file_open:
	csv_reader=csv.reader(file,delimiter='|')
	csv_reader.__next__()
	for line in csv_reader:
		age=int(line[0])
		age=int(line[1])
		age=int(line[2])
		age=int(line[3])
		if(6>5):
			key=line[9]
			key+='_'+line[0]
			key+='_'+line[1]
			key+='_'+line[2]
			key+='_'+line[3]
			key+='_'+line[4]
			value=line[5]
			outputFile.write("%s\t%s\n"%(key,value))
	file.close()
outputFile.close()