import csv
with open("<inputFile>",'r',buffering = 100000) as inputFile:
	with open("<outputFile>",'w') as outputFile:
		csv_reader= csv.reader(inputFile,delimiter='\t')
		data=[]
		for line in csv_reader:
			data.append(line)
		data.sort()
		for line in data:
			for i in range(0,len(line)):
				if(i!=0):
					outputFile.write("\t")
				outputFile.write("%s"%line[i])
			outputFile.write("\n")