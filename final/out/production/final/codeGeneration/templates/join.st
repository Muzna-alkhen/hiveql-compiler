import glob
import csv
output=open("output.txt",'w')
file_list_a = [f for f in glob.glob("<a_location>\\\\*.csv")]
file_open_a = []
file_list_b = [f for f in glob.glob("<b_location>\\\\*.csv")]
file_open_b = []
for name in file_list_a:
    file_open_a.append(open(name,"r",buffering=100000))
for name in file_list_b:
	file_open_b.append(open(name, "r",buffering=100000))
for a_file in file_open_a:
	a_reader=csv.reader(a_file,delimiter=<a_delm>)
	for a_line in a_reader:
		<a_feild>
		for b_file in file_open_b:
			b_file.seek(0)
			b_reader=csv.reader(b_file,delimiter=<b_delm>)
			for b_line in b_reader:
				<b_feild>
				if(<on_condition>):
					for i in range(0,len(a_line)):
						if(i!=0):
							output.write("\t")
						output.write("%s"%a_line[i])
					for j in range(0,len(b_line)):
						output.write("\t")
						output.write("%s"%b_line[j])
					output.write("\n")
output.close()