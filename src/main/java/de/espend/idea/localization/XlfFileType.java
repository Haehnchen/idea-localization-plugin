package de.espend.idea.localization;

import com.intellij.icons.AllIcons;
import com.intellij.ide.IdeBundle;
import com.intellij.ide.highlighter.XmlLikeFileType;
import com.intellij.lang.xml.XMLLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class XlfFileType extends XmlLikeFileType {
    public static final XlfFileType INSTANCE = new XlfFileType();

    private XlfFileType() {
        super(XMLLanguage.INSTANCE);
    }

    @Override
    @NotNull
    public String getName() {
        return "XLF";
    }

    @Override
    @NotNull
    public String getDescription() {
        return IdeBundle.message("filetype.description.xml");
    }

    @Override
    @NotNull
    public String getDefaultExtension() {
        return "xliff";
    }

    @Override
    public Icon getIcon() {
        return AllIcons.FileTypes.Xml;
    }
}
