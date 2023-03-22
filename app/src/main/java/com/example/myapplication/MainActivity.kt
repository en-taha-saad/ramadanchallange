package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.view.View
import androidx.constraintlayout.motion.widget.MotionLayout
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ///
//        val motionLayout = findViewById<MotionLayout>(R.id.motionLayout)
        val swipeLottie = findViewById<LottieAnimationView>(R.id.swipe_lottie)
        swipeLottie.repeatCount = LottieDrawable.INFINITE
//        val lottieAnimationView2 = findViewById<LottieAnimationView>(R.id.lottieAnimationView2)

        ///
//        lottieAnimationView.playAnimation()

        ///
//        lottieAnimationView.addAnimatorListener(object : AnimatorListenerAdapter() {
//            override fun onAnimationEnd(animation: Animator) {
//                super.onAnimationEnd(animation)
//
//                ///
//                motionLayout.transitionToEnd()
//                lottieAnimationView.visibility = View.GONE
//
//                ///
//                lottieAnimationView2.visibility = View.VISIBLE
//                lottieAnimationView2.playAnimation()
//
//            }
//        })


// Set the Lottie animation to loop three times
//        lottieAnimationView.repeatCount = 5 // since repeatCount starts from 0

// Add an OnAnimationFinishedListener to the LottieAnimationView that will be called when the animation finishes
//        lottieAnimationView.addAnimatorListener(object : AnimatorListenerAdapter() {
//            override fun onAnimationEnd(animation: Animator) {
//                // Swipe left with another Lottie animation when the first animation finishes
//                // You can do this by setting the visibility of the second Lottie animation to "visible"
//                // and triggering a MotionLayout transition to move it onto the screen.
//                // Here's an example:
//                lottieAnimationView2.visibility = View.VISIBLE
//                motionLayout.transitionToEnd()
//            }
//        })

// Add an OnTransitionCompletedListener to the MotionLayout that will be called when the transition finishes
//        motionLayout.setTransitionListener(object : MotionLayout.TransitionListener {
//            override fun onTransitionStarted(motionLayout: MotionLayout?, startId: Int, endId: Int) {}
//            override fun onTransitionChange(motionLayout: MotionLayout?, startId: Int, endId: Int, progress: Float) {}
//            override fun onTransitionCompleted(motionLayout: MotionLayout?, currentId: Int) {
//                // When the transition completes, start the second Lottie animation
//                // You can do this by setting its progress to 0 and starting it.
//                // Here's an example:
//                lottieAnimationView2.progress = 0f
//                lottieAnimationView2.playAnimation()
//            }
//
//            override fun onTransitionTrigger(
//                motionLayout: MotionLayout?,
//                triggerId: Int,
//                positive: Boolean,
//                progress: Float
//            ) {
//            }
//        })

    }

}