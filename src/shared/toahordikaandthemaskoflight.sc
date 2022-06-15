.flash
	filename="toahordikaandthemaskoflight.swf"
	version=6
	fps=25
	bbox=480x420
	background=#000000
	compress

	.font GillSans "fonts/gillsans.ttf"
	.font TradeMarkerLight "fonts/trademarker_light.ttf"

	.swf icon_episode_1 "icons/episode1.swf"
	.swf icon_episode_2 "icons/episode2.swf"
	.swf icon_episode_3 "icons/episode3.swf"
	.swf icon_episode_4 "icons/episode4.swf"
	.swf icon_episode_5 "icons/episode5.swf"
	.swf icon_episode_6 "icons/episode6.swf"

	.box button_shape width=146 height=128 line=0 fill=#686A68
	.box button_cover width=146 height=128 line=0 fill=#333333E0

	.text button_episode_1_title font=GillSans size=110% color=#FFFF99 text="Toa Hordika and The\nMask Of Light #1"
	.text button_episode_2_title font=GillSans size=110% color=#FFFF99 text="Toa Hordika and The\nMask Of Light #2"
	.text button_episode_3_title font=GillSans size=110% color=#FFFF99 text="Toa Hordika and The\nMask Of Light #3"
	.text button_episode_4_title font=GillSans size=110% color=#FFFF99 text="Toa Hordika and The\nMask Of Light #4"
	.text button_episode_5_title font=GillSans size=110% color=#FFFF99 text="Toa Hordika and The\nMask Of Light #5"
	.text button_episode_6_title font=GillSans size=110% color=#FFFF99 text="Toa Hordika and The\nMask Of Light #6"

	.text button_episode_1_text font=GillSans size=110% color=#FFFFFF text="The Toa Hordika must\nretrieve the Great\nKanohi Mask of Light...\nWatch the 1st Episode\nright now online!"
	.text button_episode_2_text font=GillSans size=110% color=#FFFFFF text="The Toa Hordika must\nretrieve the Great\nKanohi Mask of Light...\nWatch the 2nd Episode\nright now online!"
	.text button_episode_3_text font=GillSans size=110% color=#FFFFFF text="Watch the 3rd Episode\nfeaturing Toa Whenua\nHordika in action!"
	.text button_episode_4_text font=GillSans size=110% color=#FFFFFF text="How will Nokama fend\noff the Visorak Hordes?\nClick play to find out."
	.text button_episode_5_text font=GillSans size=110% color=#FFFFFF text="Nuju faces the Visorak\nin this power packed\nepisode? Click play to\nwatch the animation."
	.text button_episode_6_text font=GillSans size=110% color=#FFFFFF text="The final episode, all is\nrevealed. How will the\nToa Hordika find the\nMask of Light?"

	.sprite button_episode_1_idle
		.put button_shape pin=center
		.put icon_episode_1 pin=center
	.end

	.sprite button_episode_2_idle
		.put button_shape pin=center
		.put icon_episode_2 pin=center
	.end

	.sprite button_episode_3_idle
		.put button_shape pin=center
		.put icon_episode_3 pin=center
	.end

	.sprite button_episode_4_idle
		.put button_shape pin=center
		.put icon_episode_4 pin=center
	.end

	.sprite button_episode_5_idle
		.put button_shape pin=center
		.put icon_episode_5 pin=center
	.end

	.sprite button_episode_6_idle
		.put button_shape pin=center
		.put icon_episode_6 pin=center
	.end

	.sprite button_episode_1_hover
		.put button_shape pin=center
		.put icon_episode_1 pin=center
		.put button_cover pin=center
		.put button_episode_1_title pin=top-left x=-64 y=-54 scale=19%
		.put button_episode_1_text  pin=top-left x=-64 y=-20 scale=19%
	.end

	.sprite button_episode_2_hover
		.put button_shape pin=center
		.put icon_episode_2 pin=center
		.put button_cover pin=center
		.put button_episode_2_title pin=top-left x=-64 y=-54 scale=19%
		.put button_episode_2_text  pin=top-left x=-64 y=-20 scale=19%
	.end

	.sprite button_episode_3_hover
		.put button_shape pin=center
		.put icon_episode_3 pin=center
		.put button_cover pin=center
		.put button_episode_3_title pin=top-left x=-64 y=-54 scale=19%
		.put button_episode_3_text  pin=top-left x=-64 y=-20 scale=19%
	.end

	.sprite button_episode_4_hover
		.put button_shape pin=center
		.put icon_episode_4 pin=center
		.put button_cover pin=center
		.put button_episode_4_title pin=top-left x=-64 y=-54 scale=19%
		.put button_episode_4_text  pin=top-left x=-64 y=-20 scale=19%
	.end

	.sprite button_episode_5_hover
		.put button_shape pin=center
		.put icon_episode_5 pin=center
		.put button_cover pin=center
		.put button_episode_5_title pin=top-left x=-64 y=-54 scale=19%
		.put button_episode_5_text  pin=top-left x=-64 y=-20 scale=19%
	.end

	.sprite button_episode_6_hover
		.put button_shape pin=center
		.put icon_episode_6 pin=center
		.put button_cover pin=center
		.put button_episode_6_title pin=top-left x=-64 y=-54 scale=19%
		.put button_episode_6_text  pin=top-left x=-64 y=-20 scale=19%
	.end

	.button button_episode_1
		.show button_shape pin=center as=area
		.show button_episode_1_idle as=idle
		.show button_episode_1_hover as=hover,pressed
	.end

	.button button_episode_2
		.show button_shape pin=center as=area
		.show button_episode_2_idle as=idle
		.show button_episode_2_hover as=hover,pressed
	.end

	.button button_episode_3
		.show button_shape pin=center as=area
		.show button_episode_3_idle as=idle
		.show button_episode_3_hover as=hover,pressed
	.end

	.button button_episode_4
		.show button_shape pin=center as=area
		.show button_episode_4_idle as=idle
		.show button_episode_4_hover as=hover,pressed
	.end

	.button button_episode_5
		.show button_shape pin=center as=area
		.show button_episode_5_idle as=idle
		.show button_episode_5_hover as=hover,pressed
	.end

	.button button_episode_6
		.show button_shape pin=center as=area
		.show button_episode_6_idle as=idle
		.show button_episode_6_hover as=hover,pressed
	.end

	.text menu_title font=TradeMarkerLight size=20pt color=#FFFF99 text="Toa Hordika and The Mask Of Light"
	.text menu_text font=GillSans size=100% color=#FFFFFF text="The Toa Hordika must retrieve the Great Kanohi Mask of Light, to keep it\nout of the hands of the merciless queen Roodaka and the Visorak horde.\nSomeday, this mask may be the only thing that can hold back the force of\ndarkness! But can the Toa Hordika find it before the Visorak do?"

	.sprite menu
		.put menu_title pin=center x=240 y=30
		.put menu_text pin=center x=240 y=88 scale=23%
		.put button_episode_1 x=84  y=209
		.put button_episode_2 x=240 y=209
		.put button_episode_3 x=396 y=209
		.put button_episode_4 x=84  y=347
		.put button_episode_5 x=240 y=347
		.put button_episode_6 x=396 y=347
	.end

	.put menu

	.action:
		Array(function() {
			var paddingFrames = 0;
			var totalFrames = 0;
			var showEpisode = function(url, frames) {
				if (url == null) {
					menu._visible = true;
					if (_root._level1) {
						_root._level1.unloadMovie();
					}
					totalFrames = 0;
				}
				else {
					menu._visible = false;
					loadMovie(url, "_level1");
					totalFrames = frames;
				}
			};

			menu.onEnterFrame = function() {
				if (_root._level1 && _root._level1._totalframes > 1) {
					// Return to menu if on end screen for X frames.
					// Some have empty frames after the last stop.
					if (_root._level1._currentframe >= totalFrames) {
						if (paddingFrames-- < 1) {
							showEpisode(null);
						}
					}
					else {
						// Reset frame count if not on end screen.
						paddingFrames = 125; // 25 * 5
					}
				}
			};

			menu.button_episode_1.onRelease = function() {
				showEpisode("episode1.swf", 2340);
			};
			menu.button_episode_2.onRelease = function() {
				showEpisode("episode2.swf", 2340);
			};
			menu.button_episode_3.onRelease = function() {
				showEpisode("episode3.swf", 2340);
			};
			menu.button_episode_4.onRelease = function() {
				showEpisode("episode4.swf", 2340);
			};
			menu.button_episode_5.onRelease = function() {
				showEpisode("episode5.swf", 2340);
			};
			menu.button_episode_6.onRelease = function() {
				showEpisode("episode6.swf", 2340);
			};
		})[0]();
	.end
.end
