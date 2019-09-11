import glob
import csv
output=open("<place1>",'w')
file_list_a = [f for f in glob.glob("<place2>\\*.csv")]
file_open_a = []
file_list_b = [f for f in glob.glob("<place3>\\*.csv")]
file_open_b = []
for name in file_list_a:
    file_open_a.append(open(name,"r",buffering=100000))
for name in file_list_b:
	file_open_b.append(open(name, "r",buffering=100000))
for a_file in file_open_a:
	a_reader=csv.reader(a_file,delimiter='\t')
	a_reader._next_()
	for a_line in a_reader:
		<place4>
		a_id=int(a_line[0])
		a_name=a_line[1]
		a_address=a_line[2]
		for b_file in file_open_b:
			b_file.seek(0)
			b_reader=csv.reader(b_file,delimiter='\t')
			b_reader._next_()
			for b_line in b_reader:
				<place5>
				b_id=b_line[0]
				b_phone=b_line[1]
				if(<place>):
					#print (a_line+b_line)
					for i in range(0,len(a_line)):
						if(i!=0):
							output.write("\t")
						output.write("%s"%a_line[i])
					for j in range(0,len(b_line)):
						output.write("\t")
						output.write("%s"%b_line[j])
					output.write("\n")
output.close()