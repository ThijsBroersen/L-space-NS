package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object MusicComposition extends OntologyDef(
        iri = "http://schema.org/MusicComposition",
        iris = Set("http://schema.org/MusicComposition"),
        label = "MusicComposition",
        comment = """A musical composition.""",
        `@extends` = () => List(CreativeWork.ontology)
       ){
object keys extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val composer = lspace.ns.vocab.schema.composer.property
lazy val firstPerformance = lspace.ns.vocab.schema.firstPerformance.property
lazy val includedComposition = lspace.ns.vocab.schema.includedComposition.property
lazy val iswcCode = lspace.ns.vocab.schema.iswcCode.property
lazy val lyricist = lspace.ns.vocab.schema.lyricist.property
lazy val lyrics = lspace.ns.vocab.schema.lyrics.property
lazy val musicArrangement = lspace.ns.vocab.schema.musicArrangement.property
lazy val musicCompositionForm = lspace.ns.vocab.schema.musicCompositionForm.property
lazy val musicalKey = lspace.ns.vocab.schema.musicalKey.property
lazy val recordedAs = lspace.ns.vocab.schema.recordedAs.property
}
override lazy val properties: List[LProperty] = List(composer, firstPerformance, includedComposition, iswcCode, lyricist, lyrics, musicArrangement, musicCompositionForm, musicalKey, recordedAs)
trait Properties extends lspace.ns.vocab.schema.CreativeWork.Properties{
lazy val composer = lspace.ns.vocab.schema.composer.property
lazy val firstPerformance = lspace.ns.vocab.schema.firstPerformance.property
lazy val includedComposition = lspace.ns.vocab.schema.includedComposition.property
lazy val iswcCode = lspace.ns.vocab.schema.iswcCode.property
lazy val lyricist = lspace.ns.vocab.schema.lyricist.property
lazy val lyrics = lspace.ns.vocab.schema.lyrics.property
lazy val musicArrangement = lspace.ns.vocab.schema.musicArrangement.property
lazy val musicCompositionForm = lspace.ns.vocab.schema.musicCompositionForm.property
lazy val musicalKey = lspace.ns.vocab.schema.musicalKey.property
lazy val recordedAs = lspace.ns.vocab.schema.recordedAs.property
}
}