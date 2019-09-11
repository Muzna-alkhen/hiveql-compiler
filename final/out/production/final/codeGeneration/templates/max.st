import csv
inputFile=open("<inputFile>",'r',buffering = 100000)
outputFile=open("<outputFile>",'w')
csv_reader=csv.reader(inputFile,delimiter='\t')
last_key='null'
first=True
for line in csv_reader:
	cur_key=line[0]
	val=float(line[1])
	if(cur_key==last_key):
		max_val=max(max_val,val)
	else:
		if(first==False):
			outputFile.write("%s\t%s\n"%(last_key,str(max_val)))
		max_val=val
		first=False
	last_key=cur_key
outputFile.write("%s\t%s\n"%(last_key,str(max_val)))
inputFile.close()
outputFile.close()