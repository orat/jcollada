package net.dryanhild.collada.schema15;

import dagger.Module;
import net.dryanhild.collada.schema15.parser.ParserModule;
import net.dryanhild.collada.schema15.postprocess.PostProcessModule;

@Module(injects = {
        ParserModule.class,
        PostProcessModule.class
})
public class ColladaModule {
}
