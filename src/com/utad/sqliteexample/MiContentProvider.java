package com.utad.sqliteexample;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.util.Log;

public class MiContentProvider extends ContentProvider {

	private static final String DB = "Prueba";
	private static final String TABLA = "Prueba1";

	public static final Uri CONTENT_URI = Uri.parse("content://com.utad.sqliteexample/"
			+ DB);
	public static final String PERSON_ID = "_id";
	public static final String PERSON_NAME = "Nombre";

	private MiSqliteOpenHelper mHelper = null;

	
	
	@Override
	public boolean onCreate() {
		 
		mHelper = new MiSqliteOpenHelper(getContext(), DB, null, 2);
		return true;
	}

	@Override
	public Cursor query(Uri uri, String[] projection, String selection,
			String[] selectionArgs, String sortOrder) {
		SQLiteDatabase db = mHelper.getReadableDatabase();
		return db.query(TABLA, projection, selection, selectionArgs, null,
				null, sortOrder);
	}

	@Override
	public String getType(Uri uri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Uri insert(Uri uri, ContentValues values) {
		SQLiteDatabase db = mHelper.getWritableDatabase();
		db.insert(TABLA, null, values);
		return null;
	}

	@Override
	public int delete(Uri uri, String selection, String[] selectionArgs) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Uri uri, ContentValues values, String selection,
			String[] selectionArgs) {
		// TODO Auto-generated method stub
		return 0;
	}

	class MiSqliteOpenHelper extends SQLiteOpenHelper {

		public MiSqliteOpenHelper(Context context, String name,
				CursorFactory factory, int version) {
			super(context, name, factory, version);

		
			

//			String dbPath = null;
//			if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.JELLY_BEAN_MR1) {
//				dbPath = context.getApplicationInfo().dataDir + "/databases/" + DB;
//			} else {
//				dbPath = "/data/data/" + context.getPackageName() + "/databases/" + DB;
//			}
//			
//			File dbFile = new File(dbPath);
//			
//			if (!dbFile.exists()) {
//				this.getReadableDatabase();
//				this.close();
//				try {
//					InputStream is = context.getAssets().open(DB + ".sql");
//					OutputStream os = new FileOutputStream(dbPath);
//					byte[] buffer = new byte[1024];
//					int read;
//					while ((read = is.read(buffer)) > 0) {
//						os.write(buffer, 0, read);
//					}
//					os.flush();
//					os.close();
//					is.close();
//				} catch (Exception ex) {
//					ex.printStackTrace();
//				}
//			}
//			
			
		}

		
		
		@Override
		public void onCreate(SQLiteDatabase db) {

			db.execSQL("CREATE TABLE " + TABLA + "(" + PERSON_ID
					+ " int PRIMARY KEY," + PERSON_NAME
					+ " varchar (200),edad int)");
			Log.v("VAMOS", "CREADA");
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

			Log.v("VAMOS", "anterior" + oldVersion + "nuew" + newVersion);
		}

	}

	
}
