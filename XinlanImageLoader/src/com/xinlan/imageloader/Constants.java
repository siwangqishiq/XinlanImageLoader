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
package com.xinlan.imageloader;

/**
 * @author Sergey Tarasevich (nostra13[at]gmail[dot]com)
 */
public final class Constants {

	public static final String[] IMAGES = new String[] {
			// Heavy images
			"http://t2.baidu.com/it/u=2,978036040&fm=19&gp=0.jpg",
			"http://f.hiphotos.baidu.com/image/w%3D2048/sign=7a655efe7f1ed21b79c929e59956dcc4/79f0f736afc37931f7a44925e9c4b74542a911ea.jpg",
			"http://g.hiphotos.baidu.com/image/w%3D2048/sign=da2bc76e96eef01f4d141fc5d4c69825/94cad1c8a786c917119a2c33cb3d70cf3bc7571a.jpg",
			"http://b.hiphotos.baidu.com/image/w%3D2048/sign=b2c9c105fadcd100cd9cff2146b34710/0eb30f2442a7d933419b8f7baf4bd11373f00182.jpg",
			"http://c.hiphotos.baidu.com/image/w%3D2048/sign=f71680294b540923aa69647ea660d009/bba1cd11728b4710c3b583c6c1cec3fdfc032325.jpg",
			"http://e.hiphotos.baidu.com/image/w%3D2048/sign=7b4c84de74c6a7efb926af26c9c2ae51/32fa828ba61ea8d361425505950a304e251f584a.jpg",
			"http://a.hiphotos.baidu.com/image/w%3D2048/sign=4bfc5f3458afa40f3cc6c9dd9f5c034f/a08b87d6277f9e2f3f04f50e1d30e924b899f387.jpg",
			"http://a.hiphotos.baidu.com/image/w%3D2048/sign=415be81cc45c1038247ec9c286299313/9a504fc2d56285354dd63a2792ef76c6a7ef6386.jpg",
			"http://c.hiphotos.baidu.com/image/w%3D2048/sign=6959ea75530fd9f9a01752691115d52a/0df431adcbef7609c9975c962cdda3cc7cd99e1f.jpg",
			"http://t3.baidu.com/it/u=2,979568889&fm=19&gp=0.jpg",
			"http://a.hiphotos.baidu.com/image/w%3D2048/sign=043d480159b5c9ea62f304e3e101b700/8c1001e93901213f88a830d656e736d12f2e9524.jpg",
			"http://h.hiphotos.baidu.com/image/w%3D2048/sign=8d1d2929e9c4b7453494b016fbc41f17/1c950a7b02087bf48d99f8e9f0d3572c11dfcfbd.jpg",
			"http://c.hiphotos.baidu.com/image/w%3D2048/sign=f7697a2192ef76c6d0d2fc2ba92efcfa/b03533fa828ba61eba67602f4334970a304e5920.jpg",
			"http://a.hiphotos.baidu.com/image/w%3D2048/sign=417c22a9ab014c08193b2fa53e430308/d6ca7bcb0a46f21f1651f153f4246b600c33ae4d.jpg",
			"http://h.hiphotos.baidu.com/image/w%3D2048/sign=dd7ead396f224f4a579974133dcf9152/3bf33a87e950352aa9d9fe175143fbf2b2118b71.jpg",
			"http://e.hiphotos.baidu.com/image/w%3D2048/sign=7db4896a544e9258a63481eea8bad058/4610b912c8fcc3ceb76aa83d9045d688d43f2011.jpg",
			"http://c.hiphotos.baidu.com/image/w%3D2048/sign=1850842f708b4710ce2ffaccf7f6c2fd/c995d143ad4bd113d101cb3c58afa40f4afb05eb.jpg",
			"http://h.hiphotos.baidu.com/image/w%3D2048/sign=9a10e06ff1deb48ffb69a6dec4273b29/960a304e251f95cab622e8b8cb177f3e660952ec.jpg",
			"http://b.hiphotos.baidu.com/image/w%3D2048/sign=9a34fbb18e5494ee8722081919cde1fe/241f95cad1c8a786a0fd30006509c93d71cf50ec.jpg",
			"http://g.hiphotos.baidu.com/image/w%3D2048/sign=1fe381c2c1cec3fd8b3ea075e2b0d53f/72f082025aafa40fed0ab2d3a964034f79f019eb.jpg",
			"http://a.hiphotos.baidu.com/image/w%3D2048/sign=21ed1c2079ec54e741ec1d1e8d009a50/574e9258d109b3de9c507576cebf6c81810a4cc4.jpg",
			"drawable://" + R.drawable.ic_launcher, // Image from drawables
			"http://h.hiphotos.baidu.com/image/w%3D2048/sign=eab62fcb41166d2238771294721b08f7/b7003af33a87e9508a675b6c12385343fbf2b4ba.jpg", // Link with UTF-8
			"https://www.eff.org/sites/default/files/chrome150_0.jpg", // Image from HTTPS
			"http://f.hiphotos.baidu.com/image/w%3D2048/sign=6606150dfadcd100cd9cff2146b34610/0eb30f2442a7d93395545b73af4bd11373f00135.jpg", // Redirect link
			"http://a.hiphotos.baidu.com/image/w%3D2048/sign=25aeb06d123853438ccf8021a72bb17e/4ec2d5628535e5ddf795e6de74c6a7efce1b6271.jpg", // EXIF
			"http://g.hiphotos.baidu.com/image/w%3D2048/sign=0d34fc3fa38b87d65042ac1f33302938/6c224f4a20a44623b7dfeb6c9a22720e0cf3d7a3.jpg", 
			"http://h.hiphotos.baidu.com/image/w%3D2048/sign=2e0cc3a7ab014c08193b2fa53e430308/d6ca7bcb0a46f21f7921105df4246b600c33aea3.jpg", // Wrong link
			"http://t2.baidu.com/it/u=2,978036040&fm=19&gp=0.jpg",
			"http://f.hiphotos.baidu.com/image/w%3D2048/sign=7a655efe7f1ed21b79c929e59956dcc4/79f0f736afc37931f7a44925e9c4b74542a911ea.jpg",
			"http://g.hiphotos.baidu.com/image/w%3D2048/sign=da2bc76e96eef01f4d141fc5d4c69825/94cad1c8a786c917119a2c33cb3d70cf3bc7571a.jpg",
			"http://b.hiphotos.baidu.com/image/w%3D2048/sign=b2c9c105fadcd100cd9cff2146b34710/0eb30f2442a7d933419b8f7baf4bd11373f00182.jpg",
			"http://c.hiphotos.baidu.com/image/w%3D2048/sign=f71680294b540923aa69647ea660d009/bba1cd11728b4710c3b583c6c1cec3fdfc032325.jpg",
			"http://e.hiphotos.baidu.com/image/w%3D2048/sign=7b4c84de74c6a7efb926af26c9c2ae51/32fa828ba61ea8d361425505950a304e251f584a.jpg",
			"http://a.hiphotos.baidu.com/image/w%3D2048/sign=4bfc5f3458afa40f3cc6c9dd9f5c034f/a08b87d6277f9e2f3f04f50e1d30e924b899f387.jpg",
			"http://a.hiphotos.baidu.com/image/w%3D2048/sign=415be81cc45c1038247ec9c286299313/9a504fc2d56285354dd63a2792ef76c6a7ef6386.jpg",
			"http://c.hiphotos.baidu.com/image/w%3D2048/sign=6959ea75530fd9f9a01752691115d52a/0df431adcbef7609c9975c962cdda3cc7cd99e1f.jpg",
			"http://t3.baidu.com/it/u=2,979568889&fm=19&gp=0.jpg",
			"http://a.hiphotos.baidu.com/image/w%3D2048/sign=043d480159b5c9ea62f304e3e101b700/8c1001e93901213f88a830d656e736d12f2e9524.jpg",
			"http://h.hiphotos.baidu.com/image/w%3D2048/sign=8d1d2929e9c4b7453494b016fbc41f17/1c950a7b02087bf48d99f8e9f0d3572c11dfcfbd.jpg",
			"http://c.hiphotos.baidu.com/image/w%3D2048/sign=f7697a2192ef76c6d0d2fc2ba92efcfa/b03533fa828ba61eba67602f4334970a304e5920.jpg",
			"http://a.hiphotos.baidu.com/image/w%3D2048/sign=417c22a9ab014c08193b2fa53e430308/d6ca7bcb0a46f21f1651f153f4246b600c33ae4d.jpg",
			"http://h.hiphotos.baidu.com/image/w%3D2048/sign=dd7ead396f224f4a579974133dcf9152/3bf33a87e950352aa9d9fe175143fbf2b2118b71.jpg",
			"http://e.hiphotos.baidu.com/image/w%3D2048/sign=7db4896a544e9258a63481eea8bad058/4610b912c8fcc3ceb76aa83d9045d688d43f2011.jpg",
			"http://c.hiphotos.baidu.com/image/w%3D2048/sign=1850842f708b4710ce2ffaccf7f6c2fd/c995d143ad4bd113d101cb3c58afa40f4afb05eb.jpg",
			"http://h.hiphotos.baidu.com/image/w%3D2048/sign=9a10e06ff1deb48ffb69a6dec4273b29/960a304e251f95cab622e8b8cb177f3e660952ec.jpg",
			"http://b.hiphotos.baidu.com/image/w%3D2048/sign=9a34fbb18e5494ee8722081919cde1fe/241f95cad1c8a786a0fd30006509c93d71cf50ec.jpg",
			"http://g.hiphotos.baidu.com/image/w%3D2048/sign=1fe381c2c1cec3fd8b3ea075e2b0d53f/72f082025aafa40fed0ab2d3a964034f79f019eb.jpg",
			"http://a.hiphotos.baidu.com/image/w%3D2048/sign=21ed1c2079ec54e741ec1d1e8d009a50/574e9258d109b3de9c507576cebf6c81810a4cc4.jpg",
			"drawable://" + R.drawable.ic_launcher, // Image from drawables
			"http://h.hiphotos.baidu.com/image/w%3D2048/sign=eab62fcb41166d2238771294721b08f7/b7003af33a87e9508a675b6c12385343fbf2b4ba.jpg", // Link with UTF-8
			"https://www.eff.org/sites/default/files/chrome150_0.jpg", // Image from HTTPS
			"http://f.hiphotos.baidu.com/image/w%3D2048/sign=6606150dfadcd100cd9cff2146b34610/0eb30f2442a7d93395545b73af4bd11373f00135.jpg", // Redirect link
			"http://a.hiphotos.baidu.com/image/w%3D2048/sign=25aeb06d123853438ccf8021a72bb17e/4ec2d5628535e5ddf795e6de74c6a7efce1b6271.jpg", // EXIF
			"http://g.hiphotos.baidu.com/image/w%3D2048/sign=0d34fc3fa38b87d65042ac1f33302938/6c224f4a20a44623b7dfeb6c9a22720e0cf3d7a3.jpg", 
			"http://h.hiphotos.baidu.com/image/w%3D2048/sign=2e0cc3a7ab014c08193b2fa53e430308/d6ca7bcb0a46f21f7921105df4246b600c33aea3.jpg", // Wrong link
			"http://t2.baidu.com/it/u=2,978036040&fm=19&gp=0.jpg",
			"http://f.hiphotos.baidu.com/image/w%3D2048/sign=7a655efe7f1ed21b79c929e59956dcc4/79f0f736afc37931f7a44925e9c4b74542a911ea.jpg",
			"http://g.hiphotos.baidu.com/image/w%3D2048/sign=da2bc76e96eef01f4d141fc5d4c69825/94cad1c8a786c917119a2c33cb3d70cf3bc7571a.jpg",
			"http://b.hiphotos.baidu.com/image/w%3D2048/sign=b2c9c105fadcd100cd9cff2146b34710/0eb30f2442a7d933419b8f7baf4bd11373f00182.jpg",
			"http://c.hiphotos.baidu.com/image/w%3D2048/sign=f71680294b540923aa69647ea660d009/bba1cd11728b4710c3b583c6c1cec3fdfc032325.jpg",
			"http://e.hiphotos.baidu.com/image/w%3D2048/sign=7b4c84de74c6a7efb926af26c9c2ae51/32fa828ba61ea8d361425505950a304e251f584a.jpg",
			"http://a.hiphotos.baidu.com/image/w%3D2048/sign=4bfc5f3458afa40f3cc6c9dd9f5c034f/a08b87d6277f9e2f3f04f50e1d30e924b899f387.jpg",
			"http://a.hiphotos.baidu.com/image/w%3D2048/sign=415be81cc45c1038247ec9c286299313/9a504fc2d56285354dd63a2792ef76c6a7ef6386.jpg",
			"http://c.hiphotos.baidu.com/image/w%3D2048/sign=6959ea75530fd9f9a01752691115d52a/0df431adcbef7609c9975c962cdda3cc7cd99e1f.jpg",
			"http://t3.baidu.com/it/u=2,979568889&fm=19&gp=0.jpg",
			"http://a.hiphotos.baidu.com/image/w%3D2048/sign=043d480159b5c9ea62f304e3e101b700/8c1001e93901213f88a830d656e736d12f2e9524.jpg",
			"http://h.hiphotos.baidu.com/image/w%3D2048/sign=8d1d2929e9c4b7453494b016fbc41f17/1c950a7b02087bf48d99f8e9f0d3572c11dfcfbd.jpg",
			"http://c.hiphotos.baidu.com/image/w%3D2048/sign=f7697a2192ef76c6d0d2fc2ba92efcfa/b03533fa828ba61eba67602f4334970a304e5920.jpg",
			"http://a.hiphotos.baidu.com/image/w%3D2048/sign=417c22a9ab014c08193b2fa53e430308/d6ca7bcb0a46f21f1651f153f4246b600c33ae4d.jpg",
			"http://h.hiphotos.baidu.com/image/w%3D2048/sign=dd7ead396f224f4a579974133dcf9152/3bf33a87e950352aa9d9fe175143fbf2b2118b71.jpg",
			"http://e.hiphotos.baidu.com/image/w%3D2048/sign=7db4896a544e9258a63481eea8bad058/4610b912c8fcc3ceb76aa83d9045d688d43f2011.jpg",
			"http://c.hiphotos.baidu.com/image/w%3D2048/sign=1850842f708b4710ce2ffaccf7f6c2fd/c995d143ad4bd113d101cb3c58afa40f4afb05eb.jpg",
			"http://h.hiphotos.baidu.com/image/w%3D2048/sign=9a10e06ff1deb48ffb69a6dec4273b29/960a304e251f95cab622e8b8cb177f3e660952ec.jpg",
			"http://b.hiphotos.baidu.com/image/w%3D2048/sign=9a34fbb18e5494ee8722081919cde1fe/241f95cad1c8a786a0fd30006509c93d71cf50ec.jpg",
			"http://g.hiphotos.baidu.com/image/w%3D2048/sign=1fe381c2c1cec3fd8b3ea075e2b0d53f/72f082025aafa40fed0ab2d3a964034f79f019eb.jpg",
			"http://a.hiphotos.baidu.com/image/w%3D2048/sign=21ed1c2079ec54e741ec1d1e8d009a50/574e9258d109b3de9c507576cebf6c81810a4cc4.jpg",
			"drawable://" + R.drawable.ic_launcher, // Image from drawables
			"drawable://" + R.drawable.test1, // Image from drawables
			"drawable://" + R.drawable.test2, // Image from drawables
			"http://h.hiphotos.baidu.com/image/w%3D2048/sign=eab62fcb41166d2238771294721b08f7/b7003af33a87e9508a675b6c12385343fbf2b4ba.jpg", // Link with UTF-8
			"https://www.eff.org/sites/default/files/chrome150_0.jpg", // Image from HTTPS
			"http://f.hiphotos.baidu.com/image/w%3D2048/sign=6606150dfadcd100cd9cff2146b34610/0eb30f2442a7d93395545b73af4bd11373f00135.jpg", // Redirect link
			"http://a.hiphotos.baidu.com/image/w%3D2048/sign=25aeb06d123853438ccf8021a72bb17e/4ec2d5628535e5ddf795e6de74c6a7efce1b6271.jpg", // EXIF
			"http://g.hiphotos.baidu.com/image/w%3D2048/sign=0d34fc3fa38b87d65042ac1f33302938/6c224f4a20a44623b7dfeb6c9a22720e0cf3d7a3.jpg", 
			"http://h.hiphotos.baidu.com/image/w%3D2048/sign=2e0cc3a7ab014c08193b2fa53e430308/d6ca7bcb0a46f21f7921105df4246b600c33aea3.jpg", // Wrong link
	};

	private Constants() {
	}

	public static class Config {
		public static final boolean DEVELOPER_MODE = false;
	}
	
	public static class Extra {
		public static final String IMAGES = "com.nostra13.example.universalimageloader.IMAGES";
		public static final String IMAGE_POSITION = "com.nostra13.example.universalimageloader.IMAGE_POSITION";
	}
}
