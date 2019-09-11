import csv
inputFile=open("<inputFile>",'r',buffering = 100000)
outputFile=open("<outputFile>",'w')
csv_reader=csv.reader(inputFile,delimiter='\t')
last_key='null'
count=0
first=True
for line in csv_reader:
	cur_key=line[0]
	if(cur_key==last_key):
		count+=1
	else:
		if(first==False):
			outputFile.write("%s\t%s\n"%(last_key,str(count)))
		count=1
		first=False
	last_key=cur_key
outputFile.write("%s\t%s\n"%(last_key,str(count)))
inputFile.close()
outputFile.close()