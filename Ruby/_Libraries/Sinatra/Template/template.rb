# Sinatra Template

=begin
public files
- accessible to anyone - no access restrictions
- files that can be returned as is
- static html
- images
- pdfs
=end

=begin
views file
- templates
=end

require 'sinatra'

# default route
get '/' do
    "Hello, world!"
end

# rendering a static file from the public directory
get '/home' do
	filepath = File.join(settings.public_folder, 'home.html')
	send_file(filepath)
end