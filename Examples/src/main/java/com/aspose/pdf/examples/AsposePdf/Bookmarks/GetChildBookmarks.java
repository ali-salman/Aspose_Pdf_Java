/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Pdf. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.pdf.examples.AsposePdf.Bookmarks;

import com.aspose.pdf.*;
import com.aspose.pdf.examples.Utils;

public class GetChildBookmarks
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GetChildBookmarks.class);

        //open document
        Document pdfDocument = new Document(dataDir + "input.pdf");

        OutlineCollection  outline = pdfDocument.getOutlines();
        //loop through all the bookmarks
        for (int i=1; i<=outline.size(); i++ )
        {

            for(com.aspose.pdf.OutlineItemCollection outlineItem : (Iterable<com.aspose.pdf.OutlineItemCollection>)outline.get_Item(1))
            {
                System.out.println("Title :- "+outlineItem.getTitle());
                System.out.println("Is Italic :- "+ outlineItem.getItalic());
                System.out.println("Is Bold :- "+ outlineItem.getBold());
                System.out.println("Color :- "+ outlineItem.getColor());
            }

        }
    }
}




