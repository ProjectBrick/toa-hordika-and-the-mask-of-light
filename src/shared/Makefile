all: \
	toahordikaandthemaskoflight.swf

clean:
	rm -rf toahordikaandthemaskoflight.swf
	rm -rf icons/episode1.swf
	rm -rf icons/episode2.swf
	rm -rf icons/episode3.swf
	rm -rf icons/episode4.swf
	rm -rf icons/episode5.swf
	rm -rf icons/episode6.swf

toahordikaandthemaskoflight.swf:
	png2swf -o icons/episode1.swf icons/episode1.png
	png2swf -o icons/episode2.swf icons/episode2.png
	png2swf -o icons/episode3.swf icons/episode3.png
	png2swf -o icons/episode4.swf icons/episode4.png
	png2swf -o icons/episode5.swf icons/episode5.png
	png2swf -o icons/episode6.swf icons/episode6.png
	swfc toahordikaandthemaskoflight.sc
	rm icons/episode1.swf
	rm icons/episode2.swf
	rm icons/episode3.swf
	rm icons/episode4.swf
	rm icons/episode5.swf
	rm icons/episode6.swf
