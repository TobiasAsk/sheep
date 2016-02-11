/**
 * Copyright (c) 2009 Anders Ruud
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package sheep.util;

/**
 * A class which keeps track of time from one call of getDelta 
 * to the next. This will be the basis for all game timing.
 */
public class Timer {

	// The current elapsed milliseconds.
	long current;
	
	// The elapsed milliseconds one frame ago.
	long previous;
	
	/**
	 * Creates a new Timer.
	 */
	public Timer() {
		current = System.currentTimeMillis();
	}
	
	/**
	 * Gets the elapsed time (in seconds) since last call to
	 * this method.
	 * @return The elapsed time in seconds.
	 */
	public float getDelta() {
		previous = current;
		current = System.currentTimeMillis();
		
		return (float)(current-previous)/1000.0f;
	}
	
}
