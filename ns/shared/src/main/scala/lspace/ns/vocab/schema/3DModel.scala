package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object `3DModel` extends OntologyDef(
        iri = "http://schema.org/3DModel",
        iris = Set("http://schema.org/3DModel"),
        label = "3DModel",
        comment = """A 3D model represents some kind of 3D content, which may have <a class="localLink" href="http://schema.org/encoding">encoding</a>s in one or more <a class="localLink" href="http://schema.org/MediaObject">MediaObject</a>s. Many 3D formats are available (e.g. see <a href="https://en.wikipedia.org/wiki/Category:3D_graphics_file_formats">Wikipedia</a>); specific encoding formats can be represented using the <a class="localLink" href="http://schema.org/encodingFormat">encodingFormat</a> property applied to the relevant <a class="localLink" href="http://schema.org/MediaObject">MediaObject</a>. For the
case of a single file published after Zip compression, the convention of appending '+zip' to the <a class="localLink" href="http://schema.org/encodingFormat">encodingFormat</a> can be used. Geospatial, AR/VR, artistic/animation, gaming, engineering and scientific content can all be represented using <a class="localLink" href="http://schema.org/3DModel">3DModel</a>.""",
        `@extends` = List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{

}
}