//package com.viathink.sys.web.controller.excel;
//
//
//import java.util.List;
//import java.util.Map;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.web.servlet.view.document.AbstractPdfView;
//
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfWriter;
//
//public class ViewPDF extends AbstractPdfView {
//
//    @Override
//    protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
//            HttpServletRequest request, HttpServletResponse response) throws Exception {
//        List list = (List) model.get("list");
//
//        for (int i = 0; i < list.size(); i++) {
//            document.add(new Paragraph((String) list.get(i)));
//
//        }
//
//    }
//
//}