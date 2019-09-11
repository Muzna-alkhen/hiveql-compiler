import glob
import re
import csv
file_list = [f for f in glob.glob("<location>\\\\*.csv")]
file_open = []
outputFile=open("<outputPath>","w")
for name in file_list:
    file_open.append(open(name, "r",buffering = 100000))
for file in file_open:
	csv_reader=csv.reader(file,delimiter='<delimiter>')
	csv_reader.__next__()
	for line in csv_reader:
		ok=True
		try :
            <field_define>
        except:
			ok=False
		if(<whereCondition> and ok ):
			<keys>
			<value>
			<valueStar>
			<nullCondition>
	file.close()
outputFile.close()