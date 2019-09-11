import csv
inputFile=open("<inputFile>",'r',buffering = 100000)
outputFile=open("<outputFile>",'w')
csv_reader=csv.reader(inputFile,delimiter='\t')
last_key='null'
count=0
Sum=0.0
first=True
for line in csv_reader:
	cur_key=line[0]
	val=float(line[1])
	if(cur_key==last_key):
		count+=1
		Sum+=val
	else:
		if(first==False):
			outputFile.write("%s\t%s\n"%(last_key,str(Sum/count)))
		count=1
		Sum=val
		first=False
	last_key=cur_key
outputFile.write("%s\t%s\n"%(last_key,str(Sum/count)))
inputFile.close()
outputFile.close()