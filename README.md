# MAD_PRACTICAL9_21012011118

Study: ImageView, Frame by Frame Animation, Twin Animation, Immersive Mode, Display Edge to Edge, SplashScreen, AnimationDrawable, onWindowFocusChanged() Method, AnimationUtils class, loadAnimation() method, setAnimationListener() method, overridePendingTransition() method, finish() method, anim folder in res, convert SVG file to .xml file

AIM: What is Frame by Frame Animation? What is Twin Animation? How can you achieve edge-to-edge content display in your app?  Create Android Application to demonstrate Frame by frame animation and splash screen to demonstrate twin animation according to below instructions.

Create MainActivity according to below UI design.

Create SplashActivity according to Video

Create gradient Rectangle by using <gradient> tag in <shape> tag for background of SplashActivity. Use radial rectangle with x = 0.9, y =0.9, radius = 1500. Start Color pink and End Color blue. shape should be rectangle

Add these all in project: <animation-list>, oneShot attribute, <set> tag, android:startOffset = 100, android:duration=1000, <scale> tag, <translate> tag, <rotate> tag, <alpha> tag


ANSWER:

Frame by Frame Animation:
Frame by frame animation is a technique used in animation where a series of individual images (frames) are shown in rapid succession to create the illusion of motion.
It's like flipping through a flipbook where each page has a slightly different drawing to make it look like it's moving.
In Android, this is often used to create simple animations like a character walking or a loading spinner.

Twin Animation:
Twin animation is not a standard term in Android development. It's possible you may be referring to "Property Animation" or "ViewPropertyAnimator".
Property Animation allows you to animate properties of a view (like position, size, rotation) smoothly over time.

Edge-to-Edge Content Display:
Achieving edge-to-edge content display means making sure that your app's content stretches all the way to the edges of the screen, without any unused space or margins.
This provides a modern and immersive user experience, especially on devices with edge-to-edge screens.
In Android, you can achieve this by using techniques like the "System UI flags" to hide the system bars (status bar and navigation bar), or by using the appropriate layout attributes to ensure your content takes up the entire screen.
