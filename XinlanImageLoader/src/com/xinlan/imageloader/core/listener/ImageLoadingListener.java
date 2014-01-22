/*******************************************************************************
 * Copyright 2011-2013 Sergey Tarasevich
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.xinlan.imageloader.core.listener;

import com.xinlan.imageloader.core.assist.FailReason;

import android.graphics.Bitmap;
import android.view.View;

public interface ImageLoadingListener {
	
	/**
	 * �����뿪ʼʱ
	 * @param imageUri
	 * @param view
	 */
	void onLoadingStarted(String imageUri, View view);

	/**
	 * ����ʧ��ʱ�ص�
	 * @param imageUri
	 * @param view
	 * @param failReason
	 */
	void onLoadingFailed(String imageUri, View view, FailReason failReason);

	/**
	 * ����ɹ�
	 * @param imageUri
	 * @param view
	 * @param loadedImage
	 */
	void onLoadingComplete(String imageUri, View view, Bitmap loadedImage);

	/**
	 * ��������ȡ��ʱ
	 * @param imageUri
	 * @param view
	 */
	void onLoadingCancelled(String imageUri, View view);
}
