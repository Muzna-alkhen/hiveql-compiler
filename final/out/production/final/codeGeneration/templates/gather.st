import glob
import csv
file_list = [f for f in glob.glob("E:\\\\compiler\\\\reducerOutput\\\\*.csv")]
file_objs = []
outputFile=open("E:\\\\compiler\\\\finalOutput\\\\output.csv","w")
for name in file_list:
    file_objs.append(open(name,"r",buffering=100000))
csv_reader=[]
for file in file_objs:
	csv_reader.append(csv.reader(file,delimiter='\t'))
nums_of_lines=len(list(csv_reader[0]))
file_objs[0].seek(0)
for i in range(0,nums_of_lines):
	for j in range(0,len(file_list)):
		row=csv_reader[j].__next__()
		if(j==0):#write the key first
			outputFile.write("%s"%str(row[0]))
		outputFile.write("\t%s"%str(row[1]))
	outputFile.write("\n")
outputFile.close()
for file in file_objs:
	file.close()