import glob
import csv
import re
file_list = [f for f in glob.glob("<location>\\\\*.csv")]
file_open = []
outputFile=open("E:\\\\compiler\\\\finalOutput\\\\output.csv",'w')
for name in file_list:
    file_open.append(open(name,"r"))
for file in file_open:
	csv_reader=csv.reader(file,delimiter='<delimiter>')
	csv_reader.__next__()
	for line in csv_reader:
		ok=True
		try :
			<field_list>
		except:
			ok=False
		if((<condition>) and ok ):
			<writer>
	file.close()
outputFile.close()                                                     