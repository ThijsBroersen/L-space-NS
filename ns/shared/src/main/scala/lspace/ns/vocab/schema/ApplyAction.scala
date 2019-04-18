package lspace.ns.vocab.schema
import lspace.ns.vocab.schema._
import lspace.structure.{Property => LProperty, OntologyDef}
object ApplyAction extends OntologyDef(
        iri = "http://schema.org/ApplyAction",
        iris = Set("http://schema.org/ApplyAction"),
        label = "ApplyAction",
        comment = """The act of registering to an organization/service without the guarantee to receive it.<br/><br/>

Related actions:<br/><br/>

<ul>
<li><a class="localLink" href="http://schema.org/RegisterAction">RegisterAction</a>: Unlike RegisterAction, ApplyAction has no guarantees that the application will be accepted.</li>
</ul>
""",
        `@extends` = () => List(OrganizeAction.ontology)
       ){
object keys extends lspace.ns.vocab.schema.OrganizeAction.Properties{

}
override lazy val properties: List[LProperty] = List()
trait Properties extends lspace.ns.vocab.schema.OrganizeAction.Properties{

}
}